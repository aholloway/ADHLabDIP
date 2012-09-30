package dip.lab3;

public class ConsoleRenderer implements MessageRendererStrategy {

    private final String NULL_MESSAGE_ERROR = "Error: Message may not be null";

    public void renderMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException(NULL_MESSAGE_ERROR);
        } else {
            //render message to console
            System.out.println(message);
        }

    }
}