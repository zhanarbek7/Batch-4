package Day36.Dealership;

public class Car extends Vehicle{
    int numSeats;

    public Car(String registrationNumber, String make, String model, double rentalRate,
               int numSeats){
        super(registrationNumber, make, model, rentalRate);
        this.numSeats = numSeats;
    }
}
