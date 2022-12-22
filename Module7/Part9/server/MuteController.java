package Module7.Part9.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MuteController {
    private Map<Long, List<Long>> muteList = new HashMap<>();

    public void addClientToMuteList(Long client, Long clientToMute) {
        List<Long> mutedClients = muteList.get(client);

        if (mutedClients == null) {
            mutedClients = new ArrayList<>();
        }

        mutedClients.add(clientToMute);
        muteList.put(client, mutedClients);
    }

    public void removeClientToMuteList(Long client, Long clientToUnmute) {
        List<Long> mutedClients = muteList.get(client);

        if (mutedClients == null) {
            mutedClients = new ArrayList<>();
        }

        mutedClients.remove(clientToUnmute);
        muteList.put(client, mutedClients);
    }

    public boolean isClientMuted(Long client, Long questionableClient) {
        List<Long> mutedClients = muteList.get(client);

        if (mutedClients == null) {
            return false;
        }

        return mutedClients.contains(questionableClient);
    }

}
