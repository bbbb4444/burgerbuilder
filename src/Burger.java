public class Burger {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;

    public Burger(String bun, String patty, boolean lettuce, boolean tomato) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    public void print() {
        if (bun != null) System.out.println("Bun: " + bun);
        if (patty != null) System.out.println("Patty: " + patty);
        if (lettuce) System.out.println("Lettuce");
        if (tomato) System.out.println("Tomato");

        System.out.println("\nEnjoy!");
    }
}
