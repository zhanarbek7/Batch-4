package Day41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        System.out.println("/Users/codewiseacademy/Desktop/Zhanarbek/Batch4/Classroom/src/Day41");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String fileName = scanner.nextLine();

        // Prepare a file location and file name
        String filePath = "/Users/codewiseacademy/Desktop/Zhanarbek/Batch4/Classroom/src/Day41";
        filePath+= "/" + fileName + ".txt";

        // Create a file in "filePath"
        // Write in this file "Batch4 good evening!"
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("Batch4 good evening!");
        fileWriter.write("\n2ndLine");
        fileWriter.write("\n3rdLine");
        fileWriter.close();

    }
}
