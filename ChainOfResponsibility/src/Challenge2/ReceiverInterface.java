package Challenge2;

interface ReceiverInterface {
    void setNextChain(ReceiverInterface receiverInterface);
    void processMessage(Message message);
}

class EmailErrorHandler implements ReceiverInterface {
    private ReceiverInterface chain;

    public void setNextChain(ReceiverInterface chain) {
        this.chain = chain;
    }

    public void processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println(message.text + " " + message.priority);
        } else {
            this.chain.processMessage(message);
        }

    }
}

class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface chain;

    public void setNextChain(ReceiverInterface chain) {
        this.chain = chain;
    }

    public void processMessage(Message message) {
        if (message.text.contains("Fax")) {
            System.out.println(message.text + " " + message.priority);
        } else {
            this.chain.processMessage(message);
        }

    }
}

