package Day23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,55,3,23,53,199,9};
        modifyArray(array1);
        System.out.println("In the main method " + Arrays.toString(array1));
    }

    public static void modifyArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 10) {
                array[i] = 0;
            }
        }

        System.out.println("In the method " +Arrays.toString(array));
    }
}
