package Implementation;

interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill red");
    }
}

class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Fill green");
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Fill blue");
    }
}