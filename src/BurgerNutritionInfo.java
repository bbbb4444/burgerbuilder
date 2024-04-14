public class BurgerNutritionInfo {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;

    public BurgerNutritionInfo(String bun, String patty, boolean lettuce, boolean tomato) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    public void print() {
        int calories = 0;

        System.out.println("Burger Nutrition Info:");
        if (bun != null) {
            System.out.println("- Bun: " + bun + " -- " + 150);
            calories += 150;
        }
        if (patty != null) {
            System.out.println("- Patty: " + patty + " -- " + 200);
            calories += 200;
        }
        if (lettuce) {
            System.out.println("- Lettuce" + " -- " + 5);
            calories += 5;
        }
        if (tomato) {
            System.out.println("- Tomato" + " -- " + 5);
            calories += 5;
        }
        System.out.println("Total calories: " + calories);
    }
}
