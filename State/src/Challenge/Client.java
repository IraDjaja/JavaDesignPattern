package Challenge;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.alert();
        context.alert();

        State silent = new Silent();
        context.setState(silent);
        context.alert();
        context.alert();
        context.alert();
    }
}
