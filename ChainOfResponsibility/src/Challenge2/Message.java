package Challenge2;

enum MessagePriority {
    Normal,
    High
}

public class Message {
    String text;

    MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }
}
