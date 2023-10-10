package Day24;

public class Main {
    // IS BETTER
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Apple";
        laptop1.color = "Silver";
        laptop1.memory = 512;
        laptop1.ram = 16;
        laptop1.price = 1500;
        laptop1.year = 2022;

        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        laptop2.color = "Black";
        laptop2.memory = 256;
        laptop2.ram = 8;
        laptop2.price = 700;
        laptop2.year = 2020;

        Laptop laptop3 = new Laptop();
        laptop3.brand = "Acer";
        laptop3.color = "Black";
        laptop3.memory = 1024;
        laptop3.ram = 8;
        laptop3.price = 700;
        laptop3.year = 2018;

        Laptop[] laptops = {laptop1, laptop2, laptop3};

        for(int i = 0; i < laptops.length; i++){
            System.out.println(laptops[i].brand);
            System.out.println(laptops[i].year);
            System.out.println(laptops[i].price);
            System.out.println(laptops[i].memory);
            System.out.println(laptops[i].color);
            System.out.println(laptops[i].ram);
            System.out.println("---------------");
        }


    }
}
