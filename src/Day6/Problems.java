package Day6;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        // 1st task
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println(name + ", have a productive day!");
        // 2nd task
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        System.out.println(number1+number2);
        // 3rd task
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int result = number1 + number2;
//        System.out.println(result);
        // 4th task
//        double num1 = scanner.nextDouble();
//        double num2 = scanner.nextDouble();
//        double average = (num1+num2)/2;
//        System.out.println("Average of " + num1 + " and " + num2 + " is " + average);
        // 5th task
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//        int product = number1 * number2 * number3;
//        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + product);
        // 6th task
//        double n1 = scanner.nextDouble();
//        double n2 = scanner.nextDouble();
//        double n3 = scanner.nextDouble();
//        double n4 = scanner.nextDouble();
//        double result = n1/n2/n3/n4;
//        System.out.println(n1 + " / " + n2 + " / " + n3 + " / " + n4 + " = " + result);
        // 7th task
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        System.out.println(firstDigit + "," + lastDigit + "," + secondDigit);
    }
}
