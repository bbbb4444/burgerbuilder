public class Burger {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private String result = "";

    public void addBun(String bun) {
        this.bun = bun;
        result += bun + " (Bun)";
    }

    public void addPatty(String patty) {
        this.patty = patty;
        result += ", " + patty + " (Patty)";
    }

    public void addLettuce() {
        this.lettuce = true;
        result += ", Lettuce";
    }

    public void addTomato() {
        this.tomato = true;
        result += ", Tomato";
    }

    public void print() {
        System.out.println(result);

        System.out.println("\nEnjoy!");
    }
}
