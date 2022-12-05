package Challenge;

abstract class AbstractAnimalFactory {
    abstract Animal getAnimalType(String animalType) throws Exception;
}

class ConcreteAnimalFactory extends AbstractAnimalFactory {
    @Override
    public Animal getAnimalType(String animalType) throws Exception {
        switch (animalType) {
            case "DUCK":
                return new Duck();
            case "TIGER":
                return new Tiger();
            default:
                throw new Exception("Animal type cannot be instantiated");
        }
    }
}