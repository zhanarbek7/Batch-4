package Day40.problems;

import java.util.ArrayList;
import java.util.List;

public class OnlyOdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,5,7,9,11)); // false
        boolean allOdd = true;
        for (Integer i : list) {
            if(i % 2 == 0){
                allOdd = false;
                break;
            }
        }
        System.out.println(allOdd);
    }
}
