package Day16;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));
//        System.out.println(random.nextInt(100));

        for(int i = 1; i <= 100; i++){
            System.out.println(random.nextInt(100));
        }
    }
}
