package dip.lab3;

import dip.lab3.MessageTypeEnum.MessageType;

public class ConsoleRenderer implements MessageRendererStrategy {

    private final String NULL_MESSAGE_ERROR = "Error: Message may not be null";

    public void renderMessage(Message message) {
        if (message == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_ERROR);
        } else {
            
            
            //render message to console
            
            // this is an inelegant way of handling the different enum types
            // a more elegant way would probably be a mapping, but we haven't
            // gotten to those yet.
            String stringMessageType="";
            if (message.getMessageType()==MessageType.INFORMATION){
                stringMessageType="Information";
            }else if(message.getMessageType()==MessageType.ERROR){
                stringMessageType="Error";
            }
            
            System.out.println(message.getHeaderMessage()+ " ("+
                    stringMessageType+")");
            System.out.println(message.getMainMessage());
        }

    }
}