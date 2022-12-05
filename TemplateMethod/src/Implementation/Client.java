package Implementation;

public class Client {
    public static void main(String[] args) {
        System.out.println("Build wood house");
        House woodHouse = new WoodHouse();
        woodHouse.buildHouse();

        System.out.println("Build glass house");
        House glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }
}
