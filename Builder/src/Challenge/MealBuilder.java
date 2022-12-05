package Challenge;

interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}

class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new CokeDrink());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}

class ChickenMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new PepsiDrink());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}