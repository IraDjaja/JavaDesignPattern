package academy.learnprogramming;

public class HotelKeeperFacade {

    public VegMenu getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) v.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu nonVegMenu = (NonVegMenu) v.getMenus();
        return nonVegMenu;
    }

    public Both getVegNonBothMenu() {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        Both vegNonBothMenu = (Both) v.getMenus();
        return vegNonBothMenu;
    }
}
