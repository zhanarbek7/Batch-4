package Day42.MultipleCatchBlocks;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        try{
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt(); // 5
            int b = scanner.nextInt(); // 5
            System.out.println(a/b); // 1
        }
        catch(ArithmeticException e){
            writer = new FileWriter("/Users/codewiseacademy/Desktop/Zhanarbek/Batch4/Classroom/src/Day42/MultipleCatchBlocks/Logger.txt",true);
            LocalDateTime now = LocalDateTime.now();
            writer.append("\n" + now +"  Arithmetic exception ");
        }
        catch(InputMismatchException e){
            writer = new FileWriter("/Users/codewiseacademy/Desktop/Zhanarbek/Batch4/Classroom/src/Day42/MultipleCatchBlocks/Logger.txt",true);
            LocalDateTime now = LocalDateTime.now();
            writer.append("\n" + now +"  InputMismatch exception ");
        }
        finally{
            writer.close();
        }




    }
}
