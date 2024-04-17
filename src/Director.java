public class Director {

    public void buildBurgerWithLettuceAndTomato(Builder builder) {
        builder.addBun("White")
                .addPatty("Beef")
                .addLettuce()
                .addTomato();
    }

    public void buildSpicyBratwurstHotdogWithTomato(Builder builder) {
        builder.addBun("White")
                .addPatty("Spicy Bratwurst")
                .addCondiment("Ketchup");
    }
}
