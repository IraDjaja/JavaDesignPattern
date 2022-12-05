package Challenge;

interface Animal {
    void eat();
    void move();
}

class Duck implements Animal {
    @Override
    public void eat() {
        System.out.println("Duck eat");
    }

    @Override
    public void move() {
        System.out.println("Duck move");
    }
}

class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eat");
    }

    @Override
    public void move() {
        System.out.println("Tiger move");
    }
}
