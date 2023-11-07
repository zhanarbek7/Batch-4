package Day38.bank;

import java.util.Scanner;

public class SavingsAccount extends BankAccount{

    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
        System.out.println("Successfully deposited to "+ accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a pin code:");
        int pinCode = scanner.nextInt();
        if(pinCode == this.pinCode){
            if(amount>balance){
                System.out.println("Failed withdraw from "+ accountNumber);
            }
            else{
                balance -= amount;
                System.out.println("Successfully made a withdraw from "+ accountNumber);
                System.out.println("Remaining balance: "+ balance);
            }
        }
        else{
            System.out.println("Wrong pinCode");
        }


    }
}
