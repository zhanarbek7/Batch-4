package Day30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            arr.add(random.nextInt(1,10));
        }

        for(Integer i: arr){
            System.out.print(i + " ");
        }

        // all elements from arrayList will be added to hashSet
        HashSet<Integer> set = new HashSet<>(arr);


        System.out.println();
        System.out.println(set);
        System.out.println(arr.size() - set.size());
    }
}
