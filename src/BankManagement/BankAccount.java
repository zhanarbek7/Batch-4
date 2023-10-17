package BankManagement;

public class BankAccount {

    String ownerName;
    int balance;

    public BankAccount(String ownerName, int startingBalance){
        this.ownerName = ownerName;
        this.balance = startingBalance;
    }

    public void deposit(int amount){
        System.out.println("Deposited to "+ ownerName +" account " + amount + "$");
        balance+=amount;
    }

    public void transfer(int amount, String from, String to){
        System.out.println(from + " account was charged 1$ for transfer");
        System.out.println("Transfer from "+ from + " to "+ to + " account, amount "+ amount + "$ completed");
        balance+=amount;
    }

    public boolean transferWithdraw(int amount){
        if(balance<(amount+1)){
            System.out.println("Transfer can't be made!");
            return false;
        }
        else{
            balance-=amount+1;
            return true;
        }
    }

    public boolean cashOut(int amount){
        if(balance<(amount)){
            System.out.println("Withdrawal is not possible");
            return false;
        }
        else{
            balance-=(amount);
            System.out.println("Withdrawn from balance " + ownerName + " account " + amount + "$");
            return true;
        }
    }

    public void displayAccountDetails(){
        System.out.println("Owner name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------");
    }


}
