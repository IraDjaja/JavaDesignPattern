package Challenge;

import java.util.Random;

abstract class BasicCar implements Cloneable {
    protected String name;
    protected int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public static int setPrice() {
//        Random r = new Random();
//        return r.nextInt(100000);
//    }

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
        this.price = 100;
    }

    @Override
    public Nano clone() {
        return (Nano) super.clone();
    }
}

class Ford extends BasicCar {
    public Ford() {
        this.name = "ford";
        this.price = 200;
    }

    @Override
    public Ford clone() {
        return (Ford) super.clone();
    }
}


