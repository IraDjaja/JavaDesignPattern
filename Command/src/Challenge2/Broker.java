package Challenge2;

import java.util.ArrayList;

public class Broker {
    private ArrayList<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
    }
}
