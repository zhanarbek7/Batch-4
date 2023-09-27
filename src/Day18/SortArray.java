package Day18;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013};

        String[] my_array2 = {"Java", "Python", "PHP", "C#",
        "C Programming", "C++"};

//        Arrays.sort(my_array1);
//        Arrays.sort(my_array2);
//
//        System.out.println(Arrays.toString(my_array1));
//        System.out.println(Arrays.toString(my_array2));

        // 1789! 2035! 1899! 1456! 2013
//        System.out.println(my_array1[0] + "! " + my_array1[1]+"! " +
//                my_array1[2] + "! " + my_array1[3] + "! " +
//                my_array1[4]);

//        for(int i = 0; i < my_array1.length; i++){
//            System.out.println(my_array1[i] + "!");
//        }

//        int[] ints = {1,5,3,44,5,65,7,83,-4};
//
//        for(int i = 0; i < 9; i+=2){
//            System.out.print(ints[i] + " hey ");
//        }

        int[] array5 = {1,2,3,4,5,6,54,90};
        int[] array6 = {1,2,3,4,5,6,54,90};
//        int counter = 0;
//        for(int i = 0; i < array5.length; i++){
//            if(array5[i] == 54 || array5[i] == 90){
//                counter++;
//            }
//        }
//        System.out.println(counter >= 1);

//        System.out.println(array5.equals(array6));
//        System.out.println(Arrays.equals(array5, array6));

        int[] array7 = new int[10];
//        System.out.println(Arrays.toString(array7));
        Arrays.fill(array7, 7);
//        System.out.println(Arrays.toString(array7));
        int[] array8 = Arrays.copyOf(array7,array7.length);
        System.out.println(array7 == array8);
        System.out.println("Array 7 = " + Arrays.toString(array7));
        System.out.println("Array 8 = " + Arrays.toString(array8));
        array8[0] = 10;
        System.out.println("Array 7 = " + Arrays.toString(array7));
        System.out.println("Array 8 = " + Arrays.toString(array8));




    }
}
