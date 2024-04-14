public class Director {

    public void buildBurgerWithLettuce(Builder builder) {
        builder.addBun("White")
                .addPatty("Beef")
                .addLettuce();
    }

    public void buildBurgerWithTomato(Builder builder) {
        builder.addBun("White")
                .addPatty("Beef")
                .addTomato();
    }

    public void buildBurgerWithLettuceAndTomato(Builder builder) {
        builder.addBun("White")
                .addPatty("Beef")
                .addLettuce()
                .addTomato();
    }
}
