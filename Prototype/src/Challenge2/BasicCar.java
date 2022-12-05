package Challenge2;

abstract class BasicCar implements Cloneable{
    protected String name;
    protected int price;

    public String getName() {
        return this.name;
    };

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BasicCar clone() {
        BasicCar clone = null;
        try {
            clone = (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Nano extends BasicCar {
    public Nano() {
        this.name = "nano";
        this.price = 10000;
    }

    public Nano clone() {
        return (Nano) super.clone();
    }
}

class Ford extends BasicCar {
    public Ford() {
        this.name = "tesla";
        this.price = 20000;
    }

    public Ford clone() {
        return (Ford) super.clone();
    }
}
