package Challenge;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        AuctionBuyer buyer1 = new AuctionBuyer(mediator, "buyer1");
        AuctionBuyer buyer2 = new AuctionBuyer(mediator, "buyer2");
        AuctionBuyer buyer3 = new AuctionBuyer(mediator, "buyer3");
        buyer1.bid(100);
        buyer2.bid(100);
        buyer3.bid(100);

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        buyer1.bid(150);
        buyer3.cancelBid();
        mediator.findHighestBidder();

        buyer1.cancelBid();
        mediator.findHighestBidder();
    }
}
