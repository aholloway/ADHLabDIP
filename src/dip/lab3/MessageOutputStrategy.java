
package dip.lab3;

/**
 * now my message renderer can take another parameter.  But how can I pass
 * the information from the message provider when right now my provider can only
 * return
 * one thing a String?  A little research tells me that I could create an object
 * that would have properties.  String- the value of the message, another String
 * that is for the title, and then a type of message that will be useful for the 
 * creation of the message.
 * 
 * So let me build that object.
 * @author Drew
 */
public interface MessageOutputStrategy {
    //public abstract void renderMessage(String message, 
    //MessageType messageType);
    public abstract void setMessage(Message message);
}
