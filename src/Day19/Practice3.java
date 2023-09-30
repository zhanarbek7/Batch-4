package Day19;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0, evens = 0, odds = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1,5);
            if(numbers[i] != 1){
                sum += numbers[i];
            }
            if(numbers[i] % 2 == 0){
                evens++;
            }
            else{
                odds++;
            }

            System.out.println(numbers[i]);
        }
        System.out.println("Array " + Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
        System.out.println("Evens = " + evens);
        System.out.println("Odds = " + odds);
    }
}
