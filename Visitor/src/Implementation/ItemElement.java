package Implementation;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruit implements ItemElement {
    private int pricePerKg;

    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm) {
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}