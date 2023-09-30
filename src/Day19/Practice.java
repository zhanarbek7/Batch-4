package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(array[0] * 2);
//        System.out.println(array[1] * 2);
//        System.out.println(array[2] * 2);
//        System.out.println(array[3] * 2);
//        System.out.println(array[4] * 2);
//        System.out.println(array[5] * 2);
//        System.out.println(array[6] * 2);
//        System.out.println(array[7] * 2);
//        System.out.println(array[8] * 2);
//        System.out.println(array[9] * 2);
//        for(int i = 0; i < array.length; i++){
//            array[i] = array[i] * 2; // static
//        }
//
//        System.out.println("Array = " + Arrays.toString(array));

        // Hardcoded update of values
//        int[] numbers = new int[5];
//        System.out.println(Arrays.toString(numbers));
//        numbers[0] = 1;
//        numbers[1] = 3;
//        numbers[2] = 7;
//        numbers[3] = 10;
//        numbers[4] = 15;
//        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the size of array");
        int size = scanner.nextInt();
        int[] numbers2 = new int[size];
        int sum = 0;

        for(int i = 0; i < numbers2.length; i++){
            System.out.println("Enter a value: ");
            numbers2[i] = scanner.nextInt();
            sum += numbers2[i];
        }

        System.out.println(Arrays.toString(numbers2));
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum / numbers2.length);

    }
}
