package Module7.Part9.client.views;

import Module7.Part9.client.ClientUtils;
import Module7.Part9.client.ICardControls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserListPanel extends JPanel {
    JPanel userListArea;
    private static Logger logger = Logger.getLogger(UserListPanel.class.getName());
    private Font defaultFont = new Font(Font.SANS_SERIF, Font.PLAIN, 12);

    public UserListPanel(ICardControls controls) {
        super(new BorderLayout(10, 10));
        JPanel wrapper = new JPanel();
        wrapper.setLayout(new BoxLayout(wrapper, BoxLayout.Y_AXIS));
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        // wraps a viewport to provide scroll capabilities
        JScrollPane scroll = new JScrollPane(content);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        // scroll.setBorder(BorderFactory.createEmptyBorder());
        // no need to add content specifically because scroll wraps it

        userListArea = content;

        wrapper.add(scroll);
        this.add(wrapper, BorderLayout.CENTER);

        userListArea.addContainerListener(new ContainerListener() {

            @Override
            public void componentAdded(ContainerEvent e) {
                if (userListArea.isVisible()) {
                    userListArea.revalidate();
                    userListArea.repaint();
                }
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                if (userListArea.isVisible()) {
                    userListArea.revalidate();
                    userListArea.repaint();
                }
            }

        });
    }

    protected void addUserListItem(long clientId, String clientName) {
        logger.log(Level.INFO, "Adding user to list: " + clientName);
        JPanel content = userListArea;
        logger.log(Level.INFO, "Userlist: " + content.getSize());
        JEditorPane textContainer = new JEditorPane("text/plain", clientName);
        textContainer.setName(clientId + "");
        // sizes the panel to attempt to take up the width of the container
        // and expand in height based on word wrapping
        textContainer.setLayout(null);
        textContainer.setPreferredSize(
                new Dimension(content.getWidth(), ClientUtils.calcHeightForText(this, clientName, content.getWidth())));
        textContainer.setMaximumSize(textContainer.getPreferredSize());
        textContainer.setEditable(false);
        // remove background and border (comment these out to see what it looks like
        // otherwise)
        ClientUtils.clearBackground(textContainer);
        // add to container
        content.add(textContainer);
    }

    protected void removeUserListItem(long clientId) {
        logger.log(Level.INFO, "removing user list item for id " + clientId);
        Component[] cs = userListArea.getComponents();
        for (Component c : cs) {
            if (c.getName().equals(clientId + "")) {
                userListArea.remove(c);
                break;
            }
        }
    }

    protected void clearUserList() {
        Component[] cs = userListArea.getComponents();
        for (Component c : cs) {
            userListArea.remove(c);
        }
    }

    protected void highlightUsername(Long clientId) {
        Component[] cs = userListArea.getComponents();
        for (Component c : cs) {
            c.setFont(null);
            c.setFont(defaultFont);
            if (c.getName().equals(clientId + "")) {
                c.setFont(new Font(Font.SERIF, Font.BOLD, 12));
            }
        }
    }

    protected void normalizeUsername(Long clientId) {
        logger.log(Level.INFO, "Normalize Username from " + clientId);
        Component[] cs = userListArea.getComponents();
        for (Component c : cs) {
            if (c.getName().equals(clientId + "")) {
                c.setForeground(Color.BLACK);
                break;
            }
        }
    }

    protected void grayOutUsername(Long clientId) {
        logger.log(Level.INFO, "Gray out Username from " + clientId);
        Component[] cs = userListArea.getComponents();
        for (Component c : cs) {
            if (c.getName().equals(clientId + "")) {
                System.out.println(c.getName());
                c.setForeground(Color.GRAY);
                break;
            }
        }
    }
}