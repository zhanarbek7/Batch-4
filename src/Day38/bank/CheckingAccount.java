package Day38.bank;

import java.util.Scanner;

public class CheckingAccount extends BankAccount{
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited to " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a pin code:");
        int pinCode = scanner.nextInt();

        if(pinCode == this.pinCode){
            if(amount <= (balance + overdraftLimit)){
                balance -= amount;
                balance -= (amount/100);
                System.out.println("Successfully made a withdraw from " + accountNumber);
            }
            else{
                System.out.println("Overdraft limit in " + accountNumber);
            }
        }
        else{
            System.out.println("Wrong pinCode");
        }
    }
}
