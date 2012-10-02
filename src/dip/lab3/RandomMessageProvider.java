/*
 * Supposed to create a random message.  How?  Trying to copy Jim's code...
 */
package dip.lab3;

import dip.lab3.MessageTypeEnum.MessageType;
import java.util.Random;

public class RandomMessageProvider implements MessageProviderStrategy {
    
    private String yourWeight="Your Weight";
    private Message message1 = new Message("You're too skinny.",yourWeight,
            MessageType.INFORMATION);
    private Message message2=new Message("You're too fat!",yourWeight,
            MessageType.ERROR);
    private Message message3=new Message("You're perfect.",yourWeight,
            MessageType.INFORMATION);
    
    private Message[] messageArray ={message1,message2,message3};
    
    
    
    @Override
    public Message getMessage() {
        //line has an error.  Where is random defined?
        //just needed import module
        Random r = new Random(System.nanoTime());
        
        //need to use r to choose the message.
        // not sure how yet.
        int index = r.nextInt(messageArray.length);
        
        return messageArray[index];
        
    }
    
}
