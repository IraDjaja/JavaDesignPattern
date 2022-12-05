package Example1;

public interface Duck {
    public void quack();
    public void fly();
}

class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Duck quack");
    }
    public void fly() {
        System.out.println("Duck fly");
    }
}
