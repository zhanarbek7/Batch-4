package Day22;

import java.util.Arrays;
import java.util.Random;

public class Classroom2 {
    public static void main(String[] args) {
        int[] array1 = new int[10]; // 0-10
        int[] array2 = new int[50]; // 0-50
        int[] array3 = new int[100]; // 0-100
        int[] array4 = new int[500]; // 0-500
        fillArrayRandom(array1, 10);
        fillArrayRandom(array2,50);
        fillArrayRandom(array3, 100);
        fillArrayRandom(array4, 500);
    }

    public static void fillArrayRandom(int[] array, int range){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(range);
        }
        System.out.println(Arrays.toString(array));
    }
}
