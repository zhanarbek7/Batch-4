package Day19;

import java.util.Arrays;

public class Classroom1 {
    public static void main(String[] args) {
        // old style
        String student1 = "Mike";
        String student2 = "John";
        String student3 = "David";
        // new style -> Array

        String[] students1 = {"Mike","John","David"};
        String[] students2 = {student1,student2,student3};
        // Compare arrays
        System.out.println(students1.equals(students2));
        System.out.println(Arrays.equals(students1, students2));

        int[] numbers = new int[1000];
        Arrays.fill(numbers,1);
        System.out.println(Arrays.toString(numbers));

        String[] smartphones1 = {"Smartphone1", "Smartphone2"};
        String[] smartphones2 = Arrays.copyOf(smartphones1, smartphones1.length);

        System.out.println("Smartphones 1 = " + Arrays.toString(smartphones1));
        System.out.println("Smartphones 2 = " + Arrays.toString(smartphones2));
        smartphones1[0] = "Smartphone3"; // change the value of element
        System.out.println();
        System.out.println("Smartphones 1 = " + Arrays.toString(smartphones1));
        System.out.println("Smartphones 2 = " + Arrays.toString(smartphones2));

    }
}
