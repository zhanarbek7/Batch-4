package Day36.Dealership;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        Car car = new Car("CAR001", "Toyota","Camry",
                50, 5);
        Motorcycle mt = new Motorcycle("MOTO001","Honda","CBR", 30,
                "Gasoline");
        Bicycle bicycle = new Bicycle("BIKE001","Scot","Scale",
                10, 7);

        dealership.add(car);
        dealership.add(mt);
        dealership.add(bicycle);

        System.out.println(dealership.rentalVehicles.size());

        dealership.rent("CAR001");
        dealership.displayRentalCars();

        dealership.returnVehicle("CAR001");
        dealership.displayRentalCars();


    }
}
