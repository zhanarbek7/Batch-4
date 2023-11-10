package Day41;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "/Users/codewiseacademy/Desktop/Zhanarbek/Batch4/Classroom/src/Day41/codewise.txt";

        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }
}
