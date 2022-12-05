package Challenge2;

abstract class Animal {
    abstract void walk();

    abstract void eat();
}

class Duck extends Animal {
    @Override
    public void walk() {
        System.out.println("Duck walk");
    }

    @Override
    public void eat() {
        System.out.println("Duck eat");
    }
}

class Tiger extends Animal {
    @Override
    public void walk() {
        System.out.println("Tiger walk");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eat");
    }
}
