package Challenge2;

public class Client {
    public static void main(String[] args) {
        EmailErrorHandler emailHandler = new EmailErrorHandler();
        FaxErrorHandler faxHandler = new FaxErrorHandler();

        faxHandler.setNextChain(emailHandler);

        IssueRaiser issueRaiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax", MessagePriority.Normal);
        Message m2 = new Message("Email", MessagePriority.High);
        Message m3 = new Message("Email", MessagePriority.Normal);
        Message m4 = new Message("Fax", MessagePriority.High);

        issueRaiser.raiseIssue(m1);
        issueRaiser.raiseIssue(m2);
        issueRaiser.raiseIssue(m3);
        issueRaiser.raiseIssue(m4);
    }
}
