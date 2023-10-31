package Day36.Dealership;

public class Motorcycle extends Vehicle{
    String engineType;

    public Motorcycle(String registrationNumber, String make, String model, double rentalRate,
                      String engineType){
        super(registrationNumber, make, model, rentalRate);
        this.engineType = engineType;
    }

}
