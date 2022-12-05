package Challenge2;

abstract class AbstractAnimalFactory {
    abstract Animal getAnimalType(String animalType);
}

class ConcreteAnimalFactory extends AbstractAnimalFactory {
    @Override
    public Animal getAnimalType(String animalType) {
        if (animalType == "duck") {
            return new Duck();
        } else if (animalType == "tiger") {
            return new Tiger();
        }
        return null;
    }
}
