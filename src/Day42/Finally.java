package Day42;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) throws IOException {
//        try{
//            System.out.println(5/0);
//        }
//        catch (Exception e){
//            System.out.println("Exception");
//        }
//        finally {
//            System.out.println("Very important code");
//        }
        System.out.println(someMethod());
    }

    public static int someMethod(){
        try{
            return 5/0;
        }
        catch(Exception e){
            return 0;
        }
        finally {
            System.out.println("Finally block");
        }
    }

}
