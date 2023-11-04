package Day36.Dealership;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Vehicle> rentalVehicles = new ArrayList<>();

    public void add(Vehicle vehicle){

        boolean isVehiclePresent = false;
        String registrationNumberToCheck = vehicle.registrationNumber;;
        // to check whether we have a car with the same RN
        for(Vehicle i: rentalVehicles){
            if(i.registrationNumber.equals(registrationNumberToCheck)){
                isVehiclePresent = true;
                break;
            }
        }
        if(!isVehiclePresent){
            rentalVehicles.add(vehicle);
            System.out.println(vehicle.make + " " + vehicle.model + " was added!");
        }
        else{
            System.out.println(vehicle.make + " " + vehicle.model +" RN is wrong!");
        }

    }

    public void rent(String registrationNumber){
        // TODO 2. we didn't check whether vehicle is available or not

        boolean isVehiclePresent = false;
        for(Vehicle i: rentalVehicles){
            if(i.registrationNumber.equals(registrationNumber)){
                isVehiclePresent = true;
                break;
            }
        }

        System.out.println(isVehiclePresent);

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
            if(rentalVehicles.get(i).registrationNumber.equals(registrationNumber)){
                rentalVehicles.get(i).available = true;
            }
        }
    }

}
