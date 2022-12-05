package Challenge;

public class Client {

    public static void main(String[] args) {
        ReceiverInterface emailHandler = new EmailErrorHandler();
        ReceiverInterface faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        IssueRaiser issueRaiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax", MessagePriority.Normal);
        Message m2 = new Message("Email", MessagePriority.High);
        Message m3 = new Message("Email", MessagePriority.Normal);
        Message m4 = new Message("Fax", MessagePriority.High);

        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
        issueRaiser.raiseMessage(m3);
        issueRaiser.raiseMessage(m4);
    }
}
