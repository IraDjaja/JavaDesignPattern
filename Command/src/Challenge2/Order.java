package Challenge2;

interface Order {
    void execute();
}

class BuyStock implements Order {
    Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}

class SellStock implements Order {
    Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}