package Day18;

import java.util.Arrays;

public class IntroArrays {
    public static void main(String[] args) {
        String car1 = "Toyota";
        String car2 = "Mercedes";
        String car3 = "BMW";

        String [] cars = new String[4];
        System.out.println(Arrays.toString(cars));
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = "Some car";
        System.out.println(Arrays.toString(cars));
    }
}
