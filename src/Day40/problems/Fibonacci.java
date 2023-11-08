package Day40.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 3;

        // for loop
        int a = 1;
        int b = 1;
        int c = a + b;

        for(int i = 1; i <= count; i++){
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }

    }


}
