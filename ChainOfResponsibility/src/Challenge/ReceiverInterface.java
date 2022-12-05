package Challenge;

public interface ReceiverInterface {
    void setNextChain(ReceiverInterface nextChain);

    void processMessage(Message message);
}

class EmailErrorHandler implements ReceiverInterface {
    private ReceiverInterface chain;

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println("Email error handler: " + message.text + " " + message.priority);
        } else {
            this.chain.processMessage(message);
        }
    }
}

class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface chain;

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void processMessage(Message message) {
        if (message.text.contains("Fax")) {
            System.out.println("Fax error handler: " + message.text + " " + message.priority);
        } else {
            this.chain.processMessage(message);
        }
    }
}


