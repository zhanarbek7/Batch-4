package Day29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCollection {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); // 1 value
        set.add("One");
        set.add("One");

        HashSet<String> set2 = new HashSet<>(); // 3 values
        set2.add("Two");
        set2.add("Three");
        set2.add("One");

        // addAll() METHOD
        set.addAll(set2); // [One, Two, Three]
        set2.addAll(set); // [One, Two, Three,]

        // clear() METHOD
        set.clear();

        HashSet<Integer> integers1 = new HashSet<>(List.of(1,2,3,4));
        HashSet<Integer> integers2 = new HashSet<>(List.of(1,3,4));


        System.out.println(integers1.remove(99));
        System.out.println(integers1);




    }

}
