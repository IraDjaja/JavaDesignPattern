package Challenge2;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        VegMealBuilder vegMealBuilder = new VegMealBuilder();
        director.buildMeal(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        System.out.println(vegMeal.getCost());
        vegMeal.showItems();

        ChickenMealBuilder chickenMealBuilder = new ChickenMealBuilder();
        director.buildMeal(chickenMealBuilder);
        Meal chickenMeal = chickenMealBuilder.getMeal();
        System.out.println(chickenMeal.getCost());
        chickenMeal.showItems();
    }
}
