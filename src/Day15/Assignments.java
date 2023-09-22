package Day15;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();


        // codingisnotcoding - 17 letters
        int counter = 0;
        for(int i = 0; i <= str1.length()-3; i++){
             String result = str1.substring(i,i+3);
             if(result.equals(str2)){
                 counter++;
             }
        }
        System.out.println(counter);
    }
}
