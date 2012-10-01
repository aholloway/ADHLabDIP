package dip.lab3;

import dip.lab3.MessageTypeEnum.MessageType;
import javax.swing.JOptionPane;

public class GuiRenderer implements MessageRendererStrategy {

    private final String NULL_MESSAGE_ERROR = "Error: Message may not be null";

    @Override
    public void renderMessage(Message message) {
        if (message == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_ERROR);
        } else {
            //render message to GUI
            //don't know how to use maps yet, but that might be a good way
            // to go from enum MessageType to JOptionPane information.
            // but I'm just going to use If logic since I just have two enum
            // types
            
            int jOptionMessageType=0;
            if (message.getMessageType()==MessageType.INFORMATION){
                jOptionMessageType=JOptionPane.INFORMATION_MESSAGE;
            }else if(message.getMessageType()==MessageType.ERROR){
                jOptionMessageType=JOptionPane.ERROR_MESSAGE;
            }
                    
            
            JOptionPane.showMessageDialog(null, 
                    message.getMainMessage(), message.getHeaderMessage(), 
                    jOptionMessageType);
            //JOptionPane.showMessageDialog(null, message.getMainMessage());
        }
    }
}
