package Challenge;

public interface Element {
    void accept(Visitor visitor);
}

class Book implements Element {
    private double price;
    private double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class CD implements Element {
    private double price;
    private double weight;

    public CD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class DVD implements Element {
    private double price;
    private double weight;

    public DVD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}