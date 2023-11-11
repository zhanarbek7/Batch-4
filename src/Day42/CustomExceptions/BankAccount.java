package Day42.CustomExceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class BankAccount {

    private String bankAccount;
    private int balance;

    public BankAccount(String bankAccount, int balance) {
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance+= amount;
        System.out.println("Successful deposit");
    }

    public void withdraw(int amount){
        try{
            if(amount > balance){
                throw new InsufficientFunds("Not enough balance");
            }
            else{
                balance-= amount;
                System.out.println("Successful withdraw");
            }
        }
        catch(InsufficientFunds e){
            try(FileWriter fileWriter = new FileWriter("/Users/codewiseacademy/Desktop/Zhanarbek/Batch4/Classroom/src/Day42/CustomExceptions/FailedTransactions.txt", true);) {
                fileWriter.write("\n " + LocalDateTime.now() + " " + e.getMessage() + " in " + bankAccount);
            }
            catch (IOException ex) {
                System.out.println("Wrong file path!");
            }
        }

    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
