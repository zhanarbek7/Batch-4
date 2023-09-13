package Day10;

import java.util.Scanner;

public class TemperatureAdviser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        if(temperature <= 32){
            System.out.println("Wear a heavy coat");
        }
        else if(temperature > 32 && temperature < 50){
            System.out.println("Wear a light jacket");
        }
        else{
            System.out.println("Wear a sweater");
        }
    }
}
