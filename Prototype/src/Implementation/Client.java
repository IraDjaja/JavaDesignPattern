package Implementation;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println(clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println(clonedShape3.getType());
    }
}
