package Challenge;

abstract class OrderProcessTemplate {
    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) {
            giftWrapping();
        }
        delivery();
    }

    public abstract void doSelect();

    public abstract void doPayment();

    public abstract void delivery();

    public void giftWrapping() {
        System.out.println("Wrap gift");
    }
}

class NetOrder extends OrderProcessTemplate {
    public void doSelect() {
        System.out.println("Add to online cart");
    }

    public void doPayment() {
        System.out.println("Pay using credit card or paypal");
    }

    public void delivery() {
        System.out.println("Postage");
    }
}

class StoreOrder extends OrderProcessTemplate {
    public void doSelect() {
        System.out.println("Pick from shelf");
    }

    public void doPayment() {
        System.out.println("Pay using cash");
    }

    public void delivery() {
        System.out.println("Counter");
    }
}