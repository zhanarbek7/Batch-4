package Day42;

import java.io.FileWriter;
import java.io.IOException;

public class TryResources {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("/Users/codewiseacademy/Desktop/Zhanarbek/Batch4/Classroom/src/Day42/text.txt")){
            fileWriter.write("Hello");
        }
        catch(IOException e){
            System.out.println("Wrong file path!");
        }
    }
}
