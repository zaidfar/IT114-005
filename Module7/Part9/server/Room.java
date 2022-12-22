package Module7.Part9.server;

import Module7.Part9.common.Constants;
import Module7.Part9.common.GeneralUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

//zf5
public class Room implements AutoCloseable {
    private String name;
    private List<ServerThread> clients = Collections.synchronizedList(new ArrayList<ServerThread>());
    private boolean isRunning = false;
    // Commands
    private final static String COMMAND_TRIGGER = "/";
    private final static String COMMAND_SENT_TO_USER = "@";
    private final static String CREATE_ROOM = "createroom";
    private final static String JOIN_ROOM = "joinroom";
    private final static String DISCONNECT = "disconnect";
    private final static String LOGOUT = "logout";
    private final static String LOGOFF = "logoff";
    private final static String ROLL = "Roll";
    private final static String COIN_FLIP = "CoinFlip";
    private final static String MUTE = "mute";
    private final static String UNMUTE = "unmute";
    private static Logger logger = Logger.getLogger(Room.class.getName());
    private HashMap<String, String> converter = null;
    private Random random = new Random();
    private String[] Flip = {"Heads", "Tail"};
    private Map<Long, List<Long>> muteList = new HashMap<>();

    public Room(String name) {
        this.name = name;
        isRunning = true;
    }

    private void info(String message) {
        logger.log(Level.INFO, String.format("Room[%s]: %s", name, message));
    }

    public String getName() {
        return name;
    }

    public boolean isRunning() {
        return isRunning;
    }

    protected synchronized void addClient(ServerThread client) {
        if (!isRunning) {
            return;
        }
        client.setCurrentRoom(this);
        if (clients.indexOf(client) > -1) {
            info("Attempting to add a client that already exists");
        } else {

            clients.add(client);
            sendConnectionStatus(client, true);
            sendRoomJoined(client);
            sendUserListToClient(client);
        }
    }

    protected synchronized void removeClient(ServerThread client) {
        if (!isRunning) {
            return;
        }

        clients.remove(client);
        // we don't need to broadcast it to the server
        // only to our own Room
        if (clients.size() > 0) {
            // sendMessage(client, "left the room");
            sendConnectionStatus(client, false);
        }
        checkClients();
    }

    /***
     * Checks the number of clients.
     * If zero, begins the cleanup process to dispose of the room
     */
    private void checkClients() {
        // Cleanup if room is empty and not lobby
        if (!name.equalsIgnoreCase("lobby") && clients.size() == 0) {
            close();
        }
    }

    /***
     * Helper function to process messages to trigger different functionality.
     *
     * @param message The original message being sent
     * @param client  The sender of the message (since they'll be the ones
     *                triggering the actions)
     */
    private boolean processCommands(String message, ServerThread client) {
        boolean wasCommand = false;
        try {
            if (message.startsWith(COMMAND_TRIGGER)) {
                String[] comm = message.split(COMMAND_TRIGGER);
                String part1 = comm[1];
                String[] comm2 = part1.split(" ");
                String command = comm2[0];
                String roomName;
                wasCommand = true;
                switch (command) {
                    case CREATE_ROOM:
                        roomName = comm2[1];
                        Room.createRoom(roomName, client);
                        break;
                    case JOIN_ROOM:
                        roomName = comm2[1];
                        Room.joinRoom(roomName, client);
                        break;
                    case DISCONNECT:
                    case LOGOUT:
                    case LOGOFF:
                        Room.disconnectClient(client, this);
                        break;
                    case COIN_FLIP:
                    case ROLL:
                        processCommand(comm[1], client.getClientId());
                        break;
                    case MUTE:
                        muteClient(client, comm2[1]);
                        break;
                    case UNMUTE:
                        unmuteClient(client, comm2[1]);
                        break;
                    default:
                        wasCommand = false;
                        break;
                }
            } else if (message.startsWith(COMMAND_SENT_TO_USER)) {
                wasCommand = true;
                String[] comm = message.split(COMMAND_SENT_TO_USER);
                String part1 = comm[1];
                String[] comm2 = part1.split(" ");
                String username = comm2[0];
                String sendMessage = part1.replace(username + " ", "");

                sendMessageToUser(client, username, sendMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wasCommand;
    }

    // Command helper methods

    protected static void getRooms(String query, ServerThread client) {
        String[] rooms = Server.INSTANCE.getRooms(query).toArray(new String[0]);
        client.sendRoomsList(rooms, (rooms != null && rooms.length == 0) ? "No rooms found containing your query string" : null);
    }

    protected static void createRoom(String roomName, ServerThread client) {
        if (Server.INSTANCE.createNewRoom(roomName)) {
            Room.joinRoom(roomName, client);
        } else {
            client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s already exists", roomName));
            client.sendRoomsList(null, String.format("Room %s already exists", roomName));
        }
    }

    protected static void joinRoom(String roomName, ServerThread client) {
        if (!Server.INSTANCE.joinRoom(roomName, client)) {
            client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s doesn't exist", roomName));
            client.sendRoomsList(null, String.format("Room %s doesn't exist", roomName));
        }
    }

    protected static void disconnectClient(ServerThread client, Room room) {
        client.setCurrentRoom(null);
        client.disconnect();
        room.removeClient(client);
    }
    // end command helper methods

    /***
     * Takes a sender and a message and broadcasts the message to all clients in
     * this room. Client is mostly passed for command purposes but we can also use
     * it to extract other client info.
     *
     * @param sender  The client sending the message
     * @param message The message to broadcast inside the room
     */
    protected synchronized void sendMessage(ServerThread sender, String message) {
        if (!isRunning) {
            return;
        }
        info("Sending message to " + clients.size() + " clients");
        if (sender != null && processCommands(message, sender)) {
            // it was a command, don't broadcast
            return;
        }
        message = formatMessage(message);
        long from = (sender == null) ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
        synchronized (clients) {
            Iterator<ServerThread> iter = clients.iterator();
            while (iter.hasNext()) {
                ServerThread client = iter.next();
                if (!client.getCurrentRoom().isClientMuted(client.getClientId(), from)) {
                    boolean messageSent = client.sendMessage(from, message);
                    if (!messageSent) {
                        handleDisconnect(iter, client);
                    }
                }
            }
        }
    }
//zf5
    protected synchronized void sendMessageToUser(ServerThread sender, String username, String message) {
        if (!isRunning) {
            return;
        }
        info("Sending message to " + username + " from " + sender.getClientName());

        message = formatMessage(message);

        synchronized (clients) {
            Iterator<ServerThread> iter = clients.iterator();
            while (iter.hasNext()) {
                ServerThread client = iter.next();
                if (client.getClientName().equals(username) && !client.getCurrentRoom().isClientMuted(client.getClientId(), sender.getClientId())) {
                    boolean messageSent = client.sendMessage(sender.getClientId(), message);
                    if (!messageSent) {
                        handleDisconnect(iter, client);
                    }
                    messageSent = sender.sendMessage(sender.getClientId(), message);
                    if (!messageSent) {
                        handleDisconnect(iter, sender);
                    }
                }
            }
        }
    }

    protected String formatMessage(String message) {
        String alteredMessage = message;
//zf5
        // expect pairs ** -- __
        if (converter == null) {
            converter = new HashMap<String, String>();
            // user symbol => output text separated by |
            converter.put("\\*{2}", "<b>|</b>");
            converter.put("--", "<i>|</i>");
            converter.put("__", "<u>|</u>");
            converter.put("#r#", "<font color=\"red\">|</font>");
            converter.put("#g#", "<font color=\"green\">|</font>");
            converter.put("#b#", "<font color=\"blue\">|</font>");
        }
        for (Entry<String, String> kvp : converter.entrySet()) {
            if (GeneralUtils.countOccurencesInString(alteredMessage, kvp.getKey().toLowerCase()) >= 2) {
                String[] s1 = alteredMessage.split(kvp.getKey().toLowerCase());
                String m = "";
                for (int i = 0; i < s1.length; i++) {
                    if (i % 2 == 0) {
                        m += s1[i];
                    } else {
                        String[] wrapper = kvp.getValue().split("\\|");
                        m += String.format("%s%s%s", wrapper[0], s1[i], wrapper[1]);
                    }
                }
                alteredMessage = m;
            }
        }
        return alteredMessage;
    }

    protected synchronized void disconnect(ServerThread client) {
        long id = client.getId();
        client.disconnect();
        broadcast("Disconnected", id);
    }

    protected synchronized void broadcast(String message, long id) {
        //System.out.println(message+" " + id);
        if (processCommand(message, id)) {
            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier

        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            if (!client.getCurrentRoom().isClientMuted(client.getClientId(), id)) {
                boolean wasSuccessful = client.sendMessage(id, message);
                if (!wasSuccessful) {
                    System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                    it.remove();
                    broadcast("Disconnected", id);
                }
            }
        }
    }

    private boolean processCommand(String message, long clientId) {

        if (message.equalsIgnoreCase("CoinFlip")) {
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if (client.getClientId() == clientId) {
                    int coin = random.nextInt(2);
                    String messageToSend = changeMessageToBold("It was " + Flip[coin]);

                    broadcast(messageToSend, clientId);
//zf5
                    return true;
                }
            }

        } else if (message.contains("Roll")) {
            String[] Sides = message.replaceAll("Roll ", "").split("d");
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if (client.getClientId() == clientId) {
                    for (int i = 0; i < Integer.parseInt(Sides[0]); i++) {
                        int die = random.nextInt(Integer.parseInt(Sides[1]));
                        String messageToSend = changeMessageToBold("your roll is" + die);

                        broadcast(messageToSend, clientId);
                    }

                    return true;

                }
            }

        } else {
            System.out.println("Entry is not valid");

        }
        if (message.equalsIgnoreCase("disconnect")) {
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if (client.getId() == clientId) {
                    it.remove();
                    disconnect(client);

                    break;
                }
            }
            return true;
        }

        return false;

    }
//zf5
    private String changeMessageToBold(String message) {
        return "<b>" + message + "</b>";
    }

    private void muteClient(ServerThread client, String clientNameToMute) {
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread iterableClient = it.next();
            if (iterableClient.getClientName().equals(clientNameToMute)) {
                addClientToMuteList(client.getClientId(), iterableClient.getClientId());
                System.out.println(String.format("%s has muted %s", client.getId(), iterableClient.getClientId()));
            }
        }
    }

    private void unmuteClient(ServerThread client, String clientNameToUnmute) {
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread iterableClient = it.next();
            if (iterableClient.getClientName().equals(clientNameToUnmute)) {
                removeClientToMuteList(client.getClientId(), iterableClient.getClientId());
                System.out.println(String.format("%s has unmuted %s", client.getId(), iterableClient.getClientId()));
            }
        }
    }

    protected synchronized void sendUserListToClient(ServerThread receiver) {
        logger.log(Level.INFO, String.format("Room[%s] Syncing client list of %s to %s", getName(), clients.size(),
                receiver.getClientName()));
        synchronized (clients) {
            Iterator<ServerThread> iter = clients.iterator();
            while (iter.hasNext()) {
                ServerThread clientInRoom = iter.next();
                if (clientInRoom.getClientId() != receiver.getClientId()) {
                    boolean messageSent = receiver.sendExistingClient(clientInRoom.getClientId(),
                            clientInRoom.getClientName());
                    // receiver somehow disconnected mid iteration
                    if (!messageSent) {
                        handleDisconnect(null, receiver);
                        break;
                    }
                }
            }
        }
    }

    protected synchronized void sendRoomJoined(ServerThread receiver) {
        boolean messageSent = receiver.sendRoomName(getName());
        if (!messageSent) {
            handleDisconnect(null, receiver);
        }
    }

    protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected) {
        // converted to a backwards loop to help avoid concurrent list modification
        // due to the recursive sendConnectionStatus()
        // this should only be needed in this particular method due to the recusion
        if (clients == null) {
            return;
        }
        synchronized (clients) {
            for (int i = clients.size() - 1; i >= 0; i--) {
                ServerThread client = clients.get(i);
                boolean messageSent = client.sendConnectionStatus(sender.getClientId(), sender.getClientName(),
                        isConnected);
                if (!messageSent) {
                    clients.remove(i);
                    info("Removed client " + client.getClientName());
                    checkClients();
                    sendConnectionStatus(client, false);
                }
            }
        }
    }

    private void addClientToMuteList(Long client, Long clientToMute) {
        List<Long> mutedClients = muteList.get(client);

        if (mutedClients == null) {
            mutedClients = new ArrayList<>();
        }

        mutedClients.add(clientToMute);						//zf5
        muteList.put(client, mutedClients);
    }

    private void removeClientToMuteList(Long client, Long clientToUnmute) {
        List<Long> mutedClients = muteList.get(client);

        if (mutedClients == null) {
            mutedClients = new ArrayList<>();
        }

        mutedClients.remove(clientToUnmute);
        muteList.put(client, mutedClients);
    }

    private boolean isClientMuted(Long client, Long questionableClient) {
        List<Long> mutedClients = muteList.get(client);

        if (mutedClients == null) {
            return false;
        }

        return mutedClients.contains(questionableClient);
    }

    private synchronized void handleDisconnect(Iterator<ServerThread> iter, ServerThread client) {
        if (iter != null) {
            iter.remove();
        }
        info("Removed client " + client.getClientName());
        checkClients();
        sendConnectionStatus(client, false);
        // sendMessage(null, client.getClientName() + " disconnected");
    }

    public void close() {
        Server.INSTANCE.removeRoom(this);
        isRunning = false;
        clients = null;
    }
}