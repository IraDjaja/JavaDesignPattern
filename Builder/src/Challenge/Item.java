package Challenge;

interface Item {
    String name();
    float price();
    Packing pack();
}

abstract class Burger implements Item{
    @Override
    public Packing pack() {
        return new Wrapper();
    }

    @Override
    public abstract String name();

    @Override
    public abstract float price();
}

abstract class Drink implements Item {
    @Override
    public Packing pack() {
        return new Bottle();
    }
    @Override
    public abstract String name();
    @Override
    public abstract float price();
}

class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegetable burger";
    }

    @Override
    public float price() {
        return 5;
    }
}

class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 6;
    }
}

class CokeDrink extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2;
    }
}

class PepsiDrink extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2;
    }
}