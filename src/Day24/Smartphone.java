package Day24;

import java.util.Scanner;

public class Smartphone {

    String brand;
    int price;

    // Constructor with parameters
    public Smartphone(String brand, int price){
        System.out.println("Constructor with parameters");
        this.brand = brand;
        this.price = price;
    }

    public Smartphone(String brand){
        this.brand = brand;
    }

    // Empty constructor
    public Smartphone(){
        System.out.println("Empty constructor");
    }

    public void myDetails(){
        System.out.println(brand);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Apple");
        Smartphone smartphone2 = new Smartphone();
        Smartphone smartphone3 = new Smartphone("Apple", 1000);

        Smartphone[] smartphones = {smartphone1, smartphone2, smartphone3};

        for(int i = 0; i < smartphones.length; i++){
            smartphones[i].myDetails();
        }
    }





}
