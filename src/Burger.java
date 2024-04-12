public class Burger {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean ketchup;

    public Burger(String bun, String patty, boolean lettuce, boolean tomato, boolean onion, boolean ketchup) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.ketchup = ketchup;
    }

    public void print() {
        System.out.println("Burger Ingredients:");
        if (bun != null) {
            System.out.println("- Bun: " + bun);
        }
        if (patty != null) {
            System.out.println("- Patty: " + patty);
        }
        if (lettuce) {
            System.out.println("- Lettuce");
        }
        if (tomato) {
            System.out.println("- Tomato");
        }
        if (onion) {
            System.out.println("- Onion");
        }
        if (ketchup) {
            System.out.println("- Ketchup");
        }

        System.out.println("Enjoy!");
    }
}
