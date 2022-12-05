package Challenge2;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        var total = 0;
        for (Item item: items) {
            total += item.price();
        }
        return total;
    }

    public void showItems() {
        for (Item item: items) {
            System.out.println(item.name() + " " + item.pack().pack() + " " + item.price());
        }
    }
}
