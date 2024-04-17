public class Hotdog {
    private String bun;
    private String patty;
    private boolean lettuce;
    private boolean tomato;
    private String result;

    public Hotdog(String bun, String patty, boolean lettuce, boolean tomato, String result) {
        this.bun = bun;
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.result = result;
    }

    public void print() {
        System.out.println("Hotdog: ");
        System.out.println(result);

        System.out.println("Enjoy!\n");
    }
}
