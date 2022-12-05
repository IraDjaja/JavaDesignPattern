package Challenge2;

public class Client {
    public static void main(String[] args) {
        Nano nano = new Nano();
        Nano nanoClone = nano.clone();
        nano.setPrice(15000);
        System.out.println(nano.getName() + " " + nano.getPrice());
        System.out.println(nanoClone.getName() + " " + nanoClone.getPrice());

        Ford ford = new Ford();
        Ford fordClone = ford.clone();
        ford.setPrice(25000);
        System.out.println(ford.getName() + " " + ford.getPrice());
        System.out.println(fordClone.getName() + " " + fordClone.getPrice());
    }
}
