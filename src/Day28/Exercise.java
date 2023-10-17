package Day28;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(true){
            System.out.println("Enter a number ");
            number = scanner.nextInt();
            if(number % 2 == 0){
                break;
            }
        }
        System.out.println("Congratulations!");
    }
}
