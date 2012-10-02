package dip.lab3;

/**
 *
 * @Drew Holloway
 */
public class MessagingService {
    //has a

    private MessageProviderStrategy messageProvider;
    private MessageRendererStrategy messageRenderer;
    private final String NULL_MESSAGE_PROVIDER_ERROR = "Error: Message Provider cannot be null";
    private final String NULL_MESSAGE_RENDERER_ERROR = "Error: Message Renderer cannot be null";

    //both are Strategy members are set in the constructor
    public MessagingService(MessageProviderStrategy messageProvider,
            MessageRendererStrategy messageRenderer) {
        this.setMessageProvider(messageProvider);
        this.setMessageRenderer(messageRenderer);
    }

    public final MessageProviderStrategy getMessageProvider() {
        return messageProvider;
    }

    public final void setMessageProvider(MessageProviderStrategy messageProvider) {
        if (messageProvider == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_PROVIDER_ERROR);
        }
        this.messageProvider = messageProvider;
    }

    public final MessageRendererStrategy getMessageRenderer() {
        return messageRenderer;
    }

    public final void setMessageRenderer(MessageRendererStrategy messageRenderer) {
        if (messageRenderer == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_RENDERER_ERROR);
        }
        this.messageRenderer = messageRenderer;
    }

    public final void renderMessage() {
//        Message message = messageProvider.getMessage();
//        messageRenderer.renderMessage(message);

        //for some reason this line fails...
        messageRenderer.renderMessage(messageProvider.getMessage());
    }
}
