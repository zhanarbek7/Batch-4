package Day18;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {
        String[] array1; // 1. not initialized array

        String[] array2 = new String[3]; // 2. initialized array
        array2[0] = "Jack";
        array2[1] = "Mike";
        array2[2] = "Smith";

        String[] array3 = {"Jack" ,"Mike", "Smith"}; // 3. initialize an array and assign values

        String[] array4 = new String[]{"Jack", "Mike", "Smith"}; // 4. initialize an array and assign values

        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("array3 = " + Arrays.toString(array3));
        System.out.println("array4 = " + Arrays.toString(array4));


        int[] nums = {6,8,2,9};
        System.out.println(Arrays.toString(nums));
        nums[3] = 5; // updates value of element at index 3
        System.out.println(Arrays.toString(nums));
        System.out.println("Sum = " + (nums[0] + nums[1] + nums[2] + nums[3]));
        System.out.println(nums.length);

        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
    }
}
