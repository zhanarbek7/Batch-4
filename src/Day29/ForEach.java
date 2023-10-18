package Day29;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<String> strings = new ArrayList<>(List.of("One","Two","Three"));
        // 1 2 3 4 5
        // Regular For loop or For-i loop
        for(int i = integers.size()-1; i >= 0; i--){
            System.out.print(integers.get(i) + " ");
        }

        // For-each loop or Enhanced For loop
        for(String i : strings){
            System.out.print(i + " ");
        }
    }
}
