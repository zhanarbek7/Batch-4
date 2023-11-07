package Day38.bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("AC123",
                0, 2);

        savingsAccount.deposit(2000);
        savingsAccount.withdraw(2000);

        CheckingAccount checkingAccount = new CheckingAccount("CA123",
                0, 100);

        checkingAccount.deposit(500);

        System.out.println(checkingAccount.balance);

        checkingAccount.withdraw(600);

        System.out.println(checkingAccount.balance);

    }
}
