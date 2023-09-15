package Day11;

import java.util.Scanner;

public class NewConditionalStatements {
    public static void main(String[] args) {
//        int number = 5;
//        if(number == 6)
//            System.out.println("Number equals to 5");
//
        int someNumber = 20;
        if(someNumber % 2 == 0){
            Scanner scanner = new Scanner(System.in);

            if(someNumber > 20){
                System.out.println("Big Number");
            }
            else if(someNumber > 30){
                System.out.println("Super Number");
            }
            else{
                System.out.println("This number is <= 20");
            }

            System.out.println("Good Luck!");
            System.out.println("Happy New Year!");
        }


    }
}
