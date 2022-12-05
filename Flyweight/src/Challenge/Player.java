package Challenge;

interface Player {
    void assignWeapon(String weapon);

    void mission();
}

class Terrorist implements Player {
    String task;

    String weapon;

    public Terrorist() {
        task = "plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("terrorist with " + weapon + " " + task);
    }
}

class CounterTerrorist implements Player {
    String task;

    String weapon;

    public CounterTerrorist() {
        task = "diffuse bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("counter terrorist with " + weapon + " " + task);
    }
}