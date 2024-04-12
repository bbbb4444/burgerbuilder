public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        BurgerBuilder burgerBuilder = new BurgerBuilder();
        director.buildVeggieBurger(burgerBuilder);
        Burger lettuceBurger = burgerBuilder.build();
        lettuceBurger.print();

        System.out.println();

        BurgerNutritionInfoBuilder nutritionBuilder = new BurgerNutritionInfoBuilder();
        director.buildVeggieBurger(nutritionBuilder);
        BurgerNutritionInfo veggieBurgerNutrition = nutritionBuilder.build();
        veggieBurgerNutrition.print();
    }
}