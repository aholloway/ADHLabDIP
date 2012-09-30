package dip.lab3;

public class ErrorMessageProvider implements MessageProviderStrategy {
    //a working version of this class would get a message from another source
    // here we just use a sample message.

    public final String SAMPLE_MESSAGE = "Catastrophic Failure";

    public String getMessage() {
        return SAMPLE_MESSAGE;
    }
}
