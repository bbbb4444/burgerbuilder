public class HotdogBuilder implements Builder {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private String condiment;
    private boolean pickles;
    private String result = "";

    public HotdogBuilder addBun(String bun) {
        this.bun = bun;
        result += "Bun: " + bun;
        return this;
    }

    public HotdogBuilder addPatty(String patty) {
        this.patty = patty;
        result += ", " + "Wiener: " + patty;
        return this;
    }

    public HotdogBuilder addLettuce() {
        this.lettuce = true;
        result += ", Lettuce";
        return this;
    }

    public HotdogBuilder addTomato() {
        this.tomato = true;
        result += ", Diced Tomato";
        return this;
    }

    public HotdogBuilder addOnion() {
        this.tomato = true;
        result += ", Diced Onion";
        return this;
    }

    public HotdogBuilder addCondiment(String condiment) {
        this.condiment = condiment;
        result += ", " + condiment;
        return this;
    }

    public HotdogBuilder addPickles() {
        this.pickles = true;
        result += ", Pickles";
        return this;
    }

    public Hotdog build() {
        return new Hotdog(bun, patty, lettuce, tomato, onion, condiment, pickles, result);
    }
}
