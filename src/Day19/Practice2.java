package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a value");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
    }
}
