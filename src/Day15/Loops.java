package Day15;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        String str = "random";
        String result = "";
//        for(int i = str.length()-1; i >= 0; i--){
//            result+=str.charAt(i);
//        }
//        System.out.println(result);
//
//        int j = str.length()-1;
//        while(j>=0){
//            result+=str.charAt(j);
//            j--;
//        }
//        System.out.println(result);

        // 4 loops
        // For loop
        // 1. initialization 2. condition 3. increment/decrement 4. statement
        // While loop
        // Do-while loop
        // For-each loop

        // task1
//        int k = 1;
//        while(k<=10){
//            System.out.println("Good morning everyone!");
//            k++;
//        }

        //task2

        Scanner scanner = new Scanner(System.in);
        // initialization
//        int number = scanner.nextInt();
//        // condition
//        while(number != 10){
//            System.out.println("Enter number 10");
//            // update expression or increment or decrement
//            number = scanner.nextInt();
//        }


        // task3
//        int number = scanner.nextInt();
//        // condition
//
//        while(number%2 != 0){
//            System.out.println("Enter even number");
//            // update expression or increment or decrement
//            number = scanner.nextInt();
//        }
//        System.out.println("Good job!");
        // Conversion
//        String stringValue = "1235";
//        int intValue = Integer.parseInt(stringValue);
//
//        System.out.println(stringValue + 5);
//        System.out.println(intValue + 5);
        // Task 4
        String word = scanner.nextLine();
//        // batch4
//        // 012345
        int j = 0;
        while(j < word.length() ){
            System.out.println(word.charAt(j));
            System.out.println(Character.isDigit(word.charAt(j)));
            j++;
        }

    }
}

