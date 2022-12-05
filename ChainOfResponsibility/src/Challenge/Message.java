package Challenge;

enum MessagePriority {
    Normal,
    High,
}

public class Message {
    String text;
    MessagePriority priority;

    public Message(String message, MessagePriority priority) {
        this.text = message;
        this.priority = priority;
    }

}


