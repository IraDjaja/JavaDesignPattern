package Challenge;

import java.util.ArrayList;

public interface Mediator {
    void addBuyer(Colleague buyer);
    void findHighestBidder();

    void removeBuyer(Colleague buyer);
}

class ConcreteMediator implements Mediator {
    ArrayList<Colleague> buyers;

    public ConcreteMediator() {
        buyers = new ArrayList<Colleague>();
    }

    public void addBuyer(Colleague buyer) {
        buyers.add(buyer);
        System.out.println("Buyer " + buyer.name + " was added to the list");
    }

    public void findHighestBidder() {
        Colleague winner = null;
        int maxBid = 0;
        for (Colleague buyer: buyers) {
            if (buyer.price > maxBid) {
                maxBid = buyer.price;
                winner = buyer;
            }
        }
        if (winner != null) {
            System.out.println("The auction winner is " + winner.name + " with " + winner.price);
        }

        for (Colleague buyer: buyers) {
            buyer.notifyAuctionEnd();
        }
    }

    public void removeBuyer(Colleague buyer) {
        buyers.remove(buyer);
    }
}