package Challenge2;

public class Stock {
    String name = "Google";
    int quantity = 100;

    public void buy() {
        System.out.println("buy " + quantity + " " + name);
    }

    public void sell() {
        System.out.println("sell " + quantity + " " + name);
    }
}
