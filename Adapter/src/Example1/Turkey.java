package Example1;

public interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Turkey gobble");
    }

    public void fly() {
        System.out.println("Turkey fly");
    }
}