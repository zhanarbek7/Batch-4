package Day36.Dealership;

public class Vehicle {
    String registrationNumber;
    String make;
    String model;
    double rentalRate;
    boolean available;

    public Vehicle(String registrationNumber, String make, String model, double rentalRate){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
        this.available = true;
    }
}
