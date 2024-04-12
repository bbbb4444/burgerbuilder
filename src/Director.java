public class Director {

    public void buildLettuceBurger(Builder builder) {
        builder.addBun("White")
                .addPatty("Beef")
                .addLettuce();
    }

    public void buildVeggieBurger(Builder builder) {
        builder.addBun("White")
                .addPatty("Veggie")
                .addLettuce()
                .addTomato()
                .addOnion()
                .addKetchup();
    }
}
