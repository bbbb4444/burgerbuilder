public class BurgerBuilder implements Builder {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;

    public BurgerBuilder addBun(String bun) {
        this.bun = bun;
        return this;
    }

    public BurgerBuilder addPatty(String patty) {
        this.patty = patty;
        return this;
    }

    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public Burger build() {
        return new Burger(bun, patty, lettuce, tomato);
    }
}
