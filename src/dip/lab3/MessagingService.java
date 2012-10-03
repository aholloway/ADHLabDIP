package dip.lab3;

/**
 *
 * @Drew Holloway
 */
public class MessagingService {
    //has a

    private MessageInputStrategy messageInput;
    private MessageOutputStrategy messageOutput;
    private final String NULL_MESSAGE_PROVIDER_ERROR = "Error: Message Input cannot be null";
    private final String NULL_MESSAGE_RENDERER_ERROR = "Error: Message Output cannot be null";

    //both are Strategy members are set in the constructor
    public MessagingService(MessageInputStrategy messageInput,
            MessageOutputStrategy messageOutput) {
        this.setMessageInput(messageInput);
        this.setMessageOutput(messageOutput);
    }

    public final MessageInputStrategy getMessageInput() {
        return messageInput;
    }

    public final void setMessageInput(MessageInputStrategy messageProvider) {
        if (messageProvider == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_PROVIDER_ERROR);
        }
        this.messageInput = messageProvider;
    }

    public final MessageOutputStrategy getMessageOutput() {
        return messageOutput;
    }

    public final void setMessageOutput(MessageOutputStrategy messageRenderer) {
        if (messageRenderer == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_RENDERER_ERROR);
        }
        this.messageOutput = messageRenderer;
    }

    public final void outputMessage() {
//        Message message = messageProvider.getMessage();
//        messageRenderer.renderMessage(message);

        //for some reason this line fails...
        messageOutput.setMessage(messageInput.getMessage());
    }
}
