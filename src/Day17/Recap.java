package Day17;

import java.util.Random;
import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        // Assignment 1 last task
//        Random random = new Random();
//        int sum = 0;
//        for(int i = 1; i <= 5; i++){
//            int randomNumber = random.nextInt(11);
//            System.out.println(randomNumber);
//            sum += randomNumber;
//        }
//        System.out.println("The sum of random numbers is " + sum);

        // 1st way Guessing game
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a secret word:");
//        String secretWord = scanner.nextLine();
//        int attempts = 0;
//        while(true){
//            String guessWord = scanner.nextLine();
//            attempts++;
//            if(secretWord.equals(guessWord)){
//                System.out.println("You guessed the secret word in" + attempts + " attempts");
//                break;
//            }
//            else{
//                System.out.println("Try again, you didn't guess!");
//            }
//        }

//        // 2nd way Guessing game
//        String word = scanner.nextLine();
//        while(!word.equals(secretWord)){
//            System.out.println("Try again, you didn't guess!");
//            word = scanner.nextLine();
//            attempts++;
//        }
//        System.out.println("You guessed the secret word in " + (attempts + 1) + " attempts");

        // Classroom task 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a secret number");
//        Random random = new Random();
//        int secretNumber = random.nextInt(0,11);
//        int guess = scanner.nextInt();
//
//        while(secretNumber!=guess){
//            System.out.println("Try again");
//            guess = scanner.nextInt();
//        }
//
//        System.out.println("Congratulations, you guessed the number "+ secretNumber);
        // task 2
//        Scanner scanner = new Scanner(System.in);
//        int greatestNumber = Integer.MAX_VALUE; // 1st number
//        for(int i = 1; i <=5; i++){
//            System.out.println("Enter a number");
//            int number = scanner.nextInt();
//            if(number < greatestNumber){
//                greatestNumber = number;
//            }
//        }
//        System.out.println("The smallest number is " + greatestNumber);


        // task 3
        Random random = new Random();
//        int counter = 0;
//        for(int i = 1; i <= 10; i++){
//            int randomNumber = random.nextInt(5,51);
//
//            System.out.println(randomNumber);
//
//            if(randomNumber > 10){
//                counter++;
//            }
//        }
//        System.out.println(counter + " numbers are greater than 10");

        int heads = 0, tails = 0;
        for(int i = 1; i <= 5; i++){
            int randomNumber = random.nextInt(1,3);
            if(randomNumber == 1){
                System.out.println("head");
                heads++;
            }
            else{
                System.out.println("tail");
                tails++;
            }
        }
        if(heads == 5 || tails == 5){
            System.out.println("You won a jackpot!");
        }




    }
}
