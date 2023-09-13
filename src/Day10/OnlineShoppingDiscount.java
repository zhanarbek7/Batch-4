package Day10;

import java.util.Scanner;

public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = scanner.nextDouble();
        if(amount > 500){
            double discount =  amount * 30 / 100;
            System.out.println("Final price after 30% is " + (amount - discount));
        }
        else if(amount > 200){
            double discount =  amount * 20 / 100;
            System.out.println("Final price after 20% is " + (amount - discount));
        }
        else if(amount > 100){
            double discount =  amount * 10 / 100;
            System.out.println("Final price after 10% is " + (amount - discount));
        }
        else{
            System.out.println("No discount");
        }

    }
}
