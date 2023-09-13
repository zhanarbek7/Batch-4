package Day10;

import java.util.Scanner;

public class IsDoubleEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        if(secondDigit % 2 == 0 && firstDigit % 2 == 0){
            System.out.println("DOUBLE EVEN");
            System.out.println("FIRST DIGIT = " + firstDigit);
            System.out.println("SECOND DIGIT = " + secondDigit);
        }
        else{
            System.out.println("Regular number");
        }
    }
}
