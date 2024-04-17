public class BurgerBuilder implements Builder {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private String condiment;
    private boolean pickles;
    private String result = "";

    public BurgerBuilder addBun(String bun) {
        this.bun = bun;
        result += "Bun: " + bun;
        return this;
    }

    public BurgerBuilder addPatty(String patty) {
        this.patty = patty;
        result += ", " + "Patty: " + patty;
        return this;
    }

    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        result += ", Lettuce";
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        result += ", Sliced Tomato";
        return this;
    }

    public BurgerBuilder addOnion() {
        this.tomato = true;
        result += ", Onion";
        return this;
    }

    public BurgerBuilder addCondiment(String condiment) {
        this.condiment = condiment;
        result += ", " + condiment;
        return this;
    }

    public BurgerBuilder addPickles() {
        this.pickles = true;
        result += ", Pickles";
        return this;
    }

    public Burger build() {
        return new Burger(bun, patty, lettuce, tomato, onion, condiment, pickles, result);
    }
}
