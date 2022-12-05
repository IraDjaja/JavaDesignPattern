package Implementation;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("hello.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}