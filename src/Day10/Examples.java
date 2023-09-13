package Day10;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String n1 = scanner.nextLine();
//        String n2 = scanner.nextLine();
//
//        if(n1 == n2){
//            System.out.println("You guessed the secret code");
//        }
//        else{
//            System.out.println("Wrong");
//        }

        // Input: 15
        // Input: 20
        // Output: Wrong

        // Input: 20
        // Input: 20
        // Output: You guessed the secret code!

//        System.out.println(true && true); // true
//        System.out.println(true && false); // false
//        System.out.println(false && true); // false
//        System.out.println(false && false); // false
//
//        System.out.println(5 < 10 && 20 > 10); // true
//        System.out.println(10 < 20 && 20 < 10); // false
//        System.out.println(5 % 2 == 1 && 10 + 2 == 11); // false
//        System.out.println(6 % 2 == 1 && 5 < 3); // false
//
//        System.out.println(5 + 5 > 10 && 5 % 2 == 1 && 3 == 3 && 2 > 5); // false

        System.out.println(5 > 10 || 5 > 2); // true
        System.out.println("hi".length()>1 || 2 > 0 || false); // true
    }
}
