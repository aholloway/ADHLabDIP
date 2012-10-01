package dip.lab3;

import javax.swing.JOptionPane;

public class GuiRenderer implements MessageRendererStrategy {

    private final String NULL_MESSAGE_ERROR = "Error: Message may not be null";

    public void renderMessage(Message message) {
        if (message == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_ERROR);
        } else {
            //render message to GUI
            JOptionPane.showMessageDialog(null, message.getMainMessage());
        }
    }
}
