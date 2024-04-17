public class HotdogBuilder implements Builder {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private String result = "";

    public HotdogBuilder addBun(String bun) {
        this.bun = bun;
        result += "Bun: " + bun;
        return this;
    }

    public HotdogBuilder addPatty(String patty) {
        this.patty = patty;
        result += ", " + "Patty: " + patty;
        return this;
    }

    public HotdogBuilder addLettuce() {
        this.lettuce = true;
        result += ", Lettuce";
        return this;
    }

    public HotdogBuilder addTomato() {
        this.tomato = true;
        result += ", Tomato";
        return this;
    }

    public Hotdog build() {
        return new Hotdog(bun, patty, lettuce, tomato, result);
    }
}
