package Day21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Commands:");
        System.out.println("1. Deposit");
        System.out.println("2. CashOut");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        int balance = 0;
        while(true){
            String answer = scanner.nextLine();

            if(answer.equals("4")){
                System.out.println("Terminating the program");
                break;
            }
            else if(answer.equals("1")){
                System.out.println("Enter the amount to deposit:");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("Your balance is updated to " + balance + "$");
            }
            else if(answer.equals("2")){
                System.out.println("Enter the amount to cash out");
                int amount = scanner.nextInt();
                if(amount > balance){
                    System.out.println("Not enough balance");
                }
                else{
                    balance -= amount;
                    System.out.println("Your balance is updated to " + balance + "$");
                }
            }
            else if(answer.equals("3")){
                System.out.println("Your balance is " + balance + "$");
            }
        }
    }
}
