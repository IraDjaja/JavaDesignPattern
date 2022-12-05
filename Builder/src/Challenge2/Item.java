package Challenge2;

interface Item {
    String name();
    float price();
    Packing pack();
}

interface Packing {
    String pack();
}

abstract class Burger implements Item {
    public abstract String name();

    public abstract float price();

    public Packing pack() {
        return new Wrapper();
    }
}

abstract class Drink implements Item {
    public abstract String name();

    public abstract float price();

    public Packing pack() {
        return new Bottle();
    }
}

class VegBurger extends Burger {
    public String name() {
        return "veg burger";
    }

    public float price() {
        return 4;
    }
}

class ChickenBurger extends Burger {
    public String name() {
        return "chicken burger";
    }

    public float price() {
        return 5;
    }
}

class Coke extends Drink {
    public String name() {
        return "coke";
    }

    public float price() {
        return 2;
    }
}

class Pepsi extends Drink {
    public String name() {
        return "pepsi";
    }

    public float price() {
        return 2;
    }
}

class Wrapper implements Packing {
    public String pack() {
        return "wrapper";
    }
}

class Bottle implements Packing {
    public String pack() {
        return "bottle";
    }
}
