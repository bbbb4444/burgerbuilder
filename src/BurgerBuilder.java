public class BurgerBuilder implements Builder {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean ketchup;

    @Override
    public BurgerBuilder addBun(String bun) {
        this.bun = bun;
        return this;
    }

    @Override
    public BurgerBuilder addPatty(String patty) {
        this.patty = patty;
        return this;
    }

    @Override
    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    @Override
    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    @Override
    public BurgerBuilder addOnion() {
        this.onion = true;
        return this;
    }

    @Override
    public BurgerBuilder addKetchup() {
        this.ketchup = true;
        return this;
    }

    public Burger build() {
        return new Burger(bun, patty, lettuce, tomato, onion, ketchup);
    }
}
