package Challenge;

public class Director {
    MealBuilder mealBuilder;

    public void makeMeal(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
        this.mealBuilder.buildBurger();
        this.mealBuilder.buildDrink();
    }
}
