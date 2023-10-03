package Day20;

import java.util.Arrays;

public class Classroom {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        // remove -> change the value to 0
        // remove from this array even numbers
        // print the array
        // [1,0,3,0,5,0,7,0,9,0]
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }


}
