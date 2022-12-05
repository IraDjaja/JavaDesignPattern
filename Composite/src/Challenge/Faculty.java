package Challenge;

interface Faculty {
    void getDetails();
}

class Professor implements Faculty {
    private String name;
    private String position;
    private String number;

    public Professor(String name, String position, String number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    @Override
    public void getDetails() {
        System.out.println(this.name + " " + this.position);
    }
}