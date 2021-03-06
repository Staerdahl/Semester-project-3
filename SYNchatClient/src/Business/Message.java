package Business;

import Acquaintance.IMessage;
import java.io.Serializable;
import java.time.Instant;

/**
 *
 * @author Group 9
 */
public abstract class Message implements Serializable, IMessage {

    private int senderID;
    private Instant timestamp;

    public Message(int senderID) {
        this.senderID = senderID;
    }

    @Override
    public int getSenderID() {
        return senderID;
    }

    @Override
    public Instant getTimestamp() {
        return timestamp;
    }

    @Override
    public abstract String getContext();

    @Override
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
