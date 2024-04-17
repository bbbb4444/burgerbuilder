public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        BurgerBuilder burgerBuilder = new BurgerBuilder();

        director.buildBurgerWithLettuceAndTomato(burgerBuilder);
        Burger burgerWithLettuceAndTomato = burgerBuilder.build();

        burgerWithLettuceAndTomato.print();

    }
}