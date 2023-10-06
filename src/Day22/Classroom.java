package Day22;

import java.util.Arrays;
import java.util.Random;

public class Classroom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[50];
        int[] array3 = new int[100];
        int[] array4 = new int[500];

        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(10);
        }

        for(int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(50);
        }

        for(int i = 0; i < array3.length; i++){
            array3[i] = random.nextInt(100);
        }

        for(int i = 0; i < array4.length; i++){
            array4[i] = random.nextInt(5000);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }

}
