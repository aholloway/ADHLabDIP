package dip.lab3;

/**
 *
 * @Drew Holloway
 */
public class Startup {
    public static void main(String[] args){
        //instantiate low level classes
        TipOfTheDayMessageProvider tipOfTheDay= new TipOfTheDayMessageProvider();
        ConsoleRenderer cr= new ConsoleRenderer();
        
        //create higher level class (service class) passing in the low level
        // classes as parameters
        MessagingService messagingService=new MessagingService(tipOfTheDay,cr);
        messagingService.renderMessage();
        
        
    }
}
