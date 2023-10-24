package Day32;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 30;
        int day = scanner.nextInt();
        switch (day){
            case 1,2,3 -> balance-=30;
            case 4 -> balance-=25;
            case 5 -> balance-=20;
            case 6,7 -> balance-=10;
            default -> System.out.println("Invalid day");
        }
        System.out.println(balance);

    }
}
