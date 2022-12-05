package Challenge2;

public class IssueRaiser {
    ReceiverInterface receiverInterface;

    public IssueRaiser(ReceiverInterface receiverInterface) {
        this.receiverInterface = receiverInterface;
    }

    public void raiseIssue(Message message) {
        if (receiverInterface != null) {
            receiverInterface.processMessage(message);
        }
    }
}
