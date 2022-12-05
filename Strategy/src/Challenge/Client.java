package Challenge;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.performOperation(new AdditionStrategy(), 1, 2));
        System.out.println(context.performOperation(new SubstractionStrategy(), 1, 2));
        System.out.println(context.performOperation(new MultiplicationStrategy(),1, 2));
    }
}
