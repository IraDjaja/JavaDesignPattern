package Challenge;

public class Client {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Stock stock = new Stock("Google", 100);

        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new SellStock(stock));
        broker.placeOrder();
    }
}
