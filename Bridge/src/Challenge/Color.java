package Challenge;

interface IColor {
    void fillWithColor(int border);
}

class RedColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + " inch border");
    }
}

class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " inch border");
    }
}
