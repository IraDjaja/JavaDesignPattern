package Challenge;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        BasicCarCache.loadCache();


        BasicCar clonedNano = BasicCarCache.getCar("nano");
        clonedNano.setPrice(150);
        System.out.println("Car is " + clonedNano.getName() + " and price is " + clonedNano.getPrice());
        BasicCar clonedNano2 = BasicCarCache.getCar("nano");
        System.out.println("Car is " + clonedNano2.getName() + " and price is " + clonedNano2.getPrice());

        BasicCar clonedShape2 = BasicCarCache.getCar("ford");
        System.out.println("Car is " + clonedShape2.getName() + " and price is " + clonedShape2.getPrice());
    }
}
