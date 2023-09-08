package Day6;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name, age and salary");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
    }
}
