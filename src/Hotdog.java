public class Hotdog {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private String condiment;
    private boolean pickles;
    private String result;

    public Hotdog(String bun, String patty, boolean lettuce, boolean tomato, boolean onion, String condiment, boolean pickles, String result) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.condiment = condiment;
        this.pickles = pickles;
        this.result = result;
    }

    public void print() {
        System.out.println("Hotdog: ");
        System.out.println(result);

        System.out.println("Enjoy!\n");
    }
}
