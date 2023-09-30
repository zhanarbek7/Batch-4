package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

    }
}
