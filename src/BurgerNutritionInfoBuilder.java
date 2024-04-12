public class BurgerNutritionInfoBuilder implements Builder {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean ketchup;

    @Override
    public BurgerNutritionInfoBuilder addBun(String bun) {
        this.bun = bun;
        return this;
    }

    @Override
    public BurgerNutritionInfoBuilder addPatty(String patty) {
        this.patty = patty;
        return this;
    }

    @Override
    public BurgerNutritionInfoBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    @Override
    public BurgerNutritionInfoBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    @Override
    public BurgerNutritionInfoBuilder addOnion() {
        this.onion = true;
        return this;
    }

    @Override
    public BurgerNutritionInfoBuilder addKetchup() {
        this.ketchup = true;
        return this;
    }

    public BurgerNutritionInfo build() {
        return new BurgerNutritionInfo(bun, patty, lettuce, tomato, onion, ketchup);
    }
}
