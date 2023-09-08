package Day6;


import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        name = scanner.nextLine();
        System.out.println("Enter byte number:");
        byte byte1 = scanner.nextByte();
        System.out.println("Enter short number:");
        short short1 = scanner.nextShort();
        System.out.println("Enter int number");
        int int1 = scanner.nextInt();
        System.out.println("Enter long number");
        long long1 = scanner.nextLong();
        System.out.println("Enter float number");
        float float1 = scanner.nextFloat();
        System.out.println("Enter double number");
        double double1 = scanner.nextDouble();
        System.out.println("Enter boolean value");
        boolean boolean1 = scanner.nextBoolean();
    }
}
