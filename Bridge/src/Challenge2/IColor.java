package Challenge2;

interface IColor {
    void fillWithColor(int border);
}

class RedColor implements IColor {
    public void fillWithColor(int border) {
        System.out.println("Red with border " + border);
    }
}

class GreenColor implements IColor {
    public void fillWithColor(int border) {
        System.out.println("Green with border " + border);
    }
}
