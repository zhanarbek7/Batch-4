package Day41.exceptions;

public class RunTime {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Numbers can't be divided by 0");
        }


    }
}
