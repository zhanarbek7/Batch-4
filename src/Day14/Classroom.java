package Day14;

import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int sum = 0;

        // 1st iteration; sum = -10
        // 2nd iteration; sum = -40
        // 3rd iteration; sum = -55
        // 4th iteration; sum = -60
        // 5th iteration; sum = -69
//        for(int i = 1; i <= 20; i++){
//            int number = scanner.nextInt();
//            sum += number;
//        }
//        System.out.println("The sum is " + sum);
        // 2 task
//        int sum = 0;
//        for(int i = 1; i <= 5; i++){
//            int number = scanner.nextInt();
//            if(number %2 == 0){
//                sum += number;
//            }
//        }
//        System.out.println(sum);
        // 3 task
//        int sumEven = 0, sumOdd = 0;
//        for(int i = 1; i <= 5; i++){
//            int number = scanner.nextInt();
//
//            if(number %2 == 0){
//                sumEven += number;
//            }
//            else{
//                sumOdd += number;
//            }
//        }
//        System.out.println("The sum of even numbers is "+sumEven);
//        System.out.println("The sum of odd numbers is "+sumOdd);
        // 4 task
//        int countEven = 0, countOdd = 0;
//        for(int i = 1; i <= 10; i++){
//            int number = scanner.nextInt();
//
//            if(number %2 == 0){
//                countEven++;
//            }
//            else{
//                countOdd++;
//            }
//        }
//        System.out.println("Number of evens is " + countEven);
//        System.out.println("Number of odds is " + countOdd);
        // 6 task
//        String word = scanner.nextLine();
//        for(int i = word.length() - 1; i>=0; i--){
//            System.out.print(word.charAt(i));
//        }

        // task 7
//        int countA = 0;
//        String word = scanner.nextLine();
//        for(int i = 0; i < word.length(); i++){
//            if(word.charAt(i) == 'b'){
//                countA++;
//            }
//        }
//        System.out.println(countA);
        // task 8
        int sum = 0;
        for(int i = 1; i <= 7; i++){
            int spentMoney = scanner.nextInt();
            sum += spentMoney * 2;
        }
        System.out.println("The total amount of points is " + sum );

    }
}
