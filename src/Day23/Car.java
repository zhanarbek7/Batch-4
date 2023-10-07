package Day23;

public class Car {
    String brand;
    String color;
    int price;

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.color = "BLUE";
        car1.price = 50000;

        Car car2 = new Car();
        car2.brand = "MERCEDES";
        car2.color = "BLACK";
        car2.price = 100000;

        System.out.println("Car 1 details");
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.price);

        System.out.println("Car 2 details");
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.price);
    }



}
