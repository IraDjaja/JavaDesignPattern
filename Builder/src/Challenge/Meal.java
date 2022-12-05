package Challenge;

import java.util.ArrayList;

class Meal {
    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float price = 0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Name: " + item.name());
            System.out.println("Packing type: " + item.pack().pack());
            System.out.println("Price: " + item.price());
        }
    }


}
