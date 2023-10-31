package Day36.Dealership;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Vehicle> rentalVehicles = new ArrayList<>();

    public void add(Vehicle vehicle){
        // TODO 1. we don't check the registration numbers
        rentalVehicles.add(vehicle);
        System.out.println(vehicle.make + " was added!");
    }

    public void rent(String registrationNumber){
        // TODO 1. we didn't check whether this registration number is present
        // TODO 2. we didn't check whether vehicle is available or not
        for(int i = 0; i < rentalVehicles.size(); i++){
            Vehicle vehicle = rentalVehicles.get(i);
            if(vehicle.registrationNumber.equals(registrationNumber)){
                vehicle.available = false;
            }
        }
    }

    public void displayRentalCars(){
        for (Vehicle rentalVehicle : rentalVehicles) {
            System.out.println("Registration number: "+ rentalVehicle.registrationNumber);
            System.out.println("Make: "+ rentalVehicle.make);
            System.out.println("Available: "+ rentalVehicle.available);
            System.out.println("----------------------");
        }
    }

    public void returnVehicle(String registrationNumber){
        // TODO 1. we didn't check whether this registration number is present
        // TODO 2. we didn't check whether vehicle is available or not
        for(int i = 0; i < rentalVehicles.size(); i++){
            Vehicle vehicle = rentalVehicles.get(i);
            if(vehicle.registrationNumber.equals(registrationNumber)){
                vehicle.available = true;
            }
        }
    }

}
