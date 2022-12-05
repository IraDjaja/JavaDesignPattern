package Challenge2;

public class Client {
    public static void main(String[] args) {
        AbstractAnimalFactory animalFactory = new ConcreteAnimalFactory();

        Animal duck = animalFactory.getAnimalType("duck");
        duck.eat();
        duck.walk();

        Animal tiger = animalFactory.getAnimalType("tiger");
        tiger.eat();
        tiger.walk();
    }
}
