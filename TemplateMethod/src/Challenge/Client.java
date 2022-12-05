package Challenge;

public class Client {
    public static void main(String[] args) {
        NetOrder netOrder = new NetOrder();
        StoreOrder storeOrder = new StoreOrder();

        netOrder.processOrder(true);
        storeOrder.processOrder(true);
    }
}
