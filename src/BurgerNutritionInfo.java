public class BurgerNutritionInfo {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean ketchup;

    public BurgerNutritionInfo(String bun, String patty, boolean lettuce, boolean tomato, boolean onion, boolean ketchup) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.ketchup = ketchup;
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
        if (onion) {
            System.out.println("- Onion" + " -- " + 5);
            calories += 5;
        }
        if (ketchup) {
            System.out.println("- Ketchup" + " -- " + 10);
            calories += 10;
        }
        System.out.println("Total calories: " + calories);
    }
}
