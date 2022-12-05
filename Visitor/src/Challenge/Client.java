package Challenge;

import java.util.ArrayList;

public class Client {
    private static ArrayList<Element> items = new ArrayList<Element>();

    public static double calculatePostage(Visitor visitor) {
        for(Element item: items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }
    public static void main(String[] args) {
        items.add(new Book(8.52, 1.05));
        items.add(new CD(18.52, 3.05));
        items.add(new DVD(6.53, 4.02));


        Visitor usPostageVisitor = new USPostageVisitor();
        Visitor southAmericaPostageVisitor = new SouthAmericaPostageVisitor();
        System.out.println(calculatePostage(usPostageVisitor));
        System.out.println(calculatePostage(southAmericaPostageVisitor));
    }
}
