package Challenge;

import java.util.ArrayList;

public class Broker {
    private ArrayList<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        for(Order order: orders) {
            order.execute();
        }
    }

}
