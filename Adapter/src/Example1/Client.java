package Example1;

public class Client {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck");
        testDuck(duck);

        System.out.println("Turkey adapter");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
