package dip.lab3;

import dip.lab3.MessageTypeEnum.MessageType;


public class TipOfTheDayMessageOutputStategy implements MessageInputStrategy {
    //a working version of this class would get a message from another source
    // here we just use a sample message, courtesy of a friend of mine.

    private final String SAMPLE_MESSAGE = "Never swap hippos midstream... unless"
            + " the water is close to boiling, the hippo you are on is about to"
            + " be cooked, and the hippo you are jumping to is wearing a "
            + "drysuit, a thermowrap, or riding a hovercraft. - Robert Ritter "
            + "Jach";
    private final String MESSAGE_HEADER = "Your Tip of the Day";
    private final MessageType messageType=MessageType.INFORMATION;
    Message messageObject = new Message(SAMPLE_MESSAGE,MESSAGE_HEADER,
            messageType);

    @Override
    public Message getMessage() {
        return messageObject;
    }

}
