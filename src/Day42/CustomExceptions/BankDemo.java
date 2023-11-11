package Day42.CustomExceptions;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234567", 1000);
        bankAccount.deposit(1000);

        bankAccount.withdraw(3000);


    }
}
