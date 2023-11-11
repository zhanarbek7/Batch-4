package Day42.CustomExceptions;

public class InsufficientFunds extends Exception{

    public InsufficientFunds(String message){
        super(message);
    }
}
