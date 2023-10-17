package Day28;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListLearn {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int randomNumber = random.nextInt(51);
            integers.add(randomNumber);
        }
        System.out.println(integers);
    }
}
