package Challenge2;

public class Client {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Stock stock = new Stock();

        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new SellStock(stock));
        broker.placeOrders();
    }
}
