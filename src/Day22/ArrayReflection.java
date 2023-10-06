package Day22;

import java.util.Arrays;

public class ArrayReflection {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        changeArray(array);
        System.out.println("In the main method array = " + Arrays.toString(array));
    }

    public static void changeArray(int[] array){
        System.out.println("In the method array = " + Arrays.toString(array));
        array[0] = 0;
        System.out.println("In the method array = " + Arrays.toString(array));
    }
}
