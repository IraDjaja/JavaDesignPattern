package Challenge;

public class Client {
    public static void main(String[] args) throws Exception {
        AbstractAnimalFactory animalFactory = new ConcreteAnimalFactory();
        Animal duck = animalFactory.getAnimalType("DUCK");
        duck.eat();
        duck.move();
        Animal tiger = animalFactory.getAnimalType("TIGER");
        tiger.eat();
        tiger.move();
        Animal lion = animalFactory.getAnimalType("LION");
        lion.eat();
    }
}
