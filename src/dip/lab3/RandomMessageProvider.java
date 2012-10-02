/*
 * Supposed to create a random message.  How?  Trying to copy Jim's code...
 */
package dip.lab3;

import java.util.Random;

public class RandomMessageProvider implements MessageProviderStrategy {
    private Message message1;
    private Message message2;
    private Message message3;
    
    private Message[] messageArray ={message1,message2,message3};
    
    
    
    @Override
    public Message getMessage() {
        //line has an error.  Where is random defined?
        //just needed import module
        Random r = new Random(System.nanoTime());
        
        //need to use r to choose the message.
        // not sure how yet.
        //messageArray
        int index = r.nextInt(messageArray.length);
        
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
