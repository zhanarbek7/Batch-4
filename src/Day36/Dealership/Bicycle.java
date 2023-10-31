package Day36.Dealership;

public class Bicycle extends Vehicle{
    int numGears;

    public Bicycle(String registrationNumber, String make, String model, double rentalRate,
                   int numGears){
        super(registrationNumber, make, model, rentalRate);
        this.numGears = numGears;
    }
}
