public class BurgerBuilder implements Builder {
    Burger burger = new Burger();

    public BurgerBuilder addBun(String bun) {
        burger.addBun(bun);
        return this;
    }

    public BurgerBuilder addPatty(String patty) {
        burger.addPatty(patty);
        return this;
    }

    public BurgerBuilder addLettuce() {
        burger.addLettuce();
        return this;
    }

    public BurgerBuilder addTomato() {
        burger.addTomato();
        return this;
    }

    public Burger build() {
        return burger;
    }
}
