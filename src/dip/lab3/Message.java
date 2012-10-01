
package dip.lab3;

import dip.lab3.MessageTypeEnum.MessageType;

/**
 *
 * @author AHolloway
 */
public class Message {

    private String mainMessage;
    private String headerMessage;
    private MessageType messageType;
    private final String NULL_MAIN_MESSAGE_ERROR = 
            "Error: Main message may not be null";
    private final String NULL_HEADER_MESSAGE_ERROR = 
            "Error: Header message may not be null";

    public Message(String mainMessage, String headerMessage, MessageType 
            messageType) {
        this.setMainMessage(mainMessage);
        this.setHeaderMessage(headerMessage);
        this.setMessageType(messageType);
    }

    public final String getMainMessage() {
        return mainMessage;
    }

    public final void setMainMessage(String mainMessage) {
        if (mainMessage == null) {
            throw new IllegalArgumentException(NULL_MAIN_MESSAGE_ERROR);
        } else {
            this.mainMessage = mainMessage;
        }
    }

    public final String getHeaderMessage() {
        return headerMessage;
    }

    public final void setHeaderMessage(String headerMessage) {
        if (headerMessage == null) {
            throw new IllegalArgumentException(NULL_HEADER_MESSAGE_ERROR);
        } else {
            this.headerMessage = headerMessage;
        }

    }

    public final MessageType getMessageType() {
        return messageType;
    }

    public final void setMessageType(MessageType messageType) {
        //enum type, no checking is necessary
        this.messageType = messageType;
    }
}
