package Day29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        // Task 1
//        ArrayList<String> strings = new ArrayList<>(
//                List.of("dog", "cat", "dog", "bird", "bird", "fish")
//        );
//        HashSet<String> set = new HashSet<>(strings);
//        System.out.println(set);
//        // To remove all duplicate values
//        // Print only unique value:
//        // cat, dog, bird, fish (order may vary)
        // Task 2

        HashSet<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(List.of(4,5,6,7,8));
//        set1.retainAll(set2); // keep only common values

        // print only uncommon values
        HashSet<Integer> finalSet = new HashSet<>(set2);
        finalSet.removeAll(set1);
        set1.removeAll(set2);

        finalSet.addAll(set1);
        System.out.println(finalSet);
    }
}
