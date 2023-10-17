package BankManagement;

public class Bank {
    int bankSavings;
    BankAccount[] bankAccounts = new BankAccount[3];
    int numberOfBankAccounts = 0;

    public void listBankAccounts(){
        for (int i = 0; i < numberOfBankAccounts; i++) {
            bankAccounts[i].displayAccountDetails();
        }
    }

    public void addBankAccount(BankAccount bankAccount){
        if(numberOfBankAccounts==5){
            System.out.println("We've reached the maximum number of bank accounts!");
        }
        else{
            bankAccounts[numberOfBankAccounts] = bankAccount;
            numberOfBankAccounts++;
        }
    }

    public void transfer(String from, String to, int amount){
        boolean makeTransfer = false;
        // to take money from one bank account
        for (int i = 0; i < numberOfBankAccounts; i++) {
            if(bankAccounts[i].ownerName.equals(from)){
                makeTransfer = bankAccounts[i].transferWithdraw(amount);
            }
        }

        if(makeTransfer){
            bankSavings+=1;
            for (int i = 0; i < numberOfBankAccounts; i++) {
                if(bankAccounts[i].ownerName.equals(to)){
                    bankAccounts[i].transfer(amount, from, to);
                }
            }
        }
    }



}
