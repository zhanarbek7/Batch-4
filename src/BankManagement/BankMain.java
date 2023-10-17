package BankManagement;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount("Zhanarbek",100);
        BankAccount bankAccount2 = new BankAccount("Elena",200);
        BankAccount bankAccount3 = new BankAccount("Maxim",300);


        bank.addBankAccount(bankAccount1);
        bank.addBankAccount(bankAccount2);
        bank.addBankAccount(bankAccount3);

        bankAccount1.deposit(500);

        bank.transfer("Elena","Zhanarbek",5);

        bank.listBankAccounts();
    }
}
