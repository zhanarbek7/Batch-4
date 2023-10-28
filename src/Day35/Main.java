package Day35;

import Day33.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {100,5,3,2,9};
        String[] str = {"hello","hi","bye","abc"};
        char[] chars = {'a','c','k','l','b'};

        Arrays.sort(array);
        Arrays.sort(str);
        Arrays.sort(chars);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(chars));
    }


}
