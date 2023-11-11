package Day42.MultipleCatchBlocks;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks2 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
            throw new RuntimeException();
        }
        catch(ArithmeticException | InputMismatchException |
              ArrayIndexOutOfBoundsException e){
            System.out.println("Exception");
        }
    }
}
