package Implementation;

public class Client {
    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;

        for (ItemElement item: items) {
            sum = sum + item.accept(visitor);
        }

        return sum;
    }
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1"), new Book(100, "2"), new Fruit(10, 2, "banana"), new Fruit(5, 5, "apple")};
        int total = calculatePrice(items);
        System.out.println("Total cost = " + total);
    }
}
