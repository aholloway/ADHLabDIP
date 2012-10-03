package dip.lab3;

public class ErrorMessageInputStrategy implements MessageInputStrategy {
    //a working version of this class would get a message from another source
    // here we just use a sample message.

    public final String SAMPLE_MESSAGE = "Catastrophic Failure";
    private final String MESSAGE_HEADER = "Uh Oh!";
    private final MessageTypeEnum.MessageType messageType=MessageTypeEnum.MessageType.ERROR;
    Message messageObject = new Message(SAMPLE_MESSAGE,MESSAGE_HEADER,
            messageType);

    @Override
    public Message getMessage() {
        return messageObject;
    }
}
