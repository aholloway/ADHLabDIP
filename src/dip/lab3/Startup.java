package dip.lab3;

/**
 *
 * @Drew Holloway
 */
public class Startup {

    public static void main(String[] args) {
        //instantiate low level classes
        TipOfTheDayMessageOutputStategy tipOfTheDay = new TipOfTheDayMessageOutputStategy();

        ConsoleRenderer cr = new ConsoleRenderer();

        //create higher level class (service class) passing in the low level
        // classes as parameters
        MessagingService messagingService = new MessagingService(tipOfTheDay, cr);
        messagingService.renderMessage();

        //demonstrate capability to switch both the message provider
        // and the message renderer at runtime
        messagingService.setMessageProvider(new ErrorMessageInputStrategy());
        messagingService.setMessageRenderer(new GuiOutputStrategy());

        messagingService.renderMessage();

        messagingService.setMessageProvider(new RandomMessageOutputStrategy());

        for (int i = 1; i <= 6; i++) {
            messagingService.renderMessage();
        }
    }
}
