package Day31;

public class Main {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle("Small","Blue");
        Bottle bottle2 = new Bottle("Big","Red");



        Factory factory = new Factory();
        factory.addBottle(bottle1);
        factory.addBottle(bottle2);

        factory.factoryDetails();
    }
}
