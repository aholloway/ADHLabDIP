package dip.lab3;


public class TipOfTheDayMessageProvider implements MessageProviderStrategy {
    //a working version of this class would get a message from another source
    // here we just use a sample message, courtesy of a friend of mine.

    public final String SAMPLE_MESSAGE = "Never swap hippos midstream... unless"
            + " the water is close to boiling, the hippo you are on is about to "
            + "be cooked, and the hippo you are jumping to is wearing a drysuit, "
            + "a thermowrap, or riding a hovercraft. - Robert Ritter Jach";

    public String getMessage() {
        return SAMPLE_MESSAGE;
    }

}
