package Challenge;

abstract class Colleague {
    protected String name;
    protected int price;

    protected Mediator mediator;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.price = price;
    }

    abstract void bid(int price);
    abstract void cancelBid();
    abstract void notifyAuctionEnd();
}

class AuctionBuyer extends Colleague {

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void bid(int price) {
        this.price = price;
    }

    public void cancelBid() {
        System.out.println(this.name + " cancels bid");
        this.price = -1;
    }

    public void notifyAuctionEnd() {
        System.out.println(this.name + " knows auction ends");
    }
}
