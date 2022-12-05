package academy.learnprogramming;

public class Client {
    public static void main(String[] args) {
        HotelKeeperFacade hotelKeeper = new HotelKeeperFacade();
        hotelKeeper.getVegMenu();
        hotelKeeper.getNonVegMenu();
        hotelKeeper.getVegNonBothMenu();
    }
}
