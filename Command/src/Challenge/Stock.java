package Challenge;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Buy " + quantity + " stock " + name);
    }

    public void sell() {
        System.out.println("Sell " + quantity + " stock " + name);
    }
}
