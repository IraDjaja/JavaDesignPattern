package Implementation;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1", 10);
        Item item2 = new Item("2", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("email", "password"));

        cart.pay(new CreditCardStrategy("name", "ccNum", "cvv", "expiryDate"));
    }
}
