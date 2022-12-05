package InterfaceSegregationPrinciple;

public interface RestaurantInterface {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkInCustomerOrder();
    public void payInPerson();
}

public class OnlineClientImpl implements RestaurantInterface {
    
}