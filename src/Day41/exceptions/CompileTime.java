package Day41.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTime {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("fileName");
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }

    }
}
