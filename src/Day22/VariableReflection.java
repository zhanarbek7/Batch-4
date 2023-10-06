package Day22;

import java.util.Random;
import java.util.Scanner;

public class VariableReflection {

    public static void main(String[] args) {

        int number = 100;
        changeNumber(10);
        System.out.println("In the main method number = " + number);
    }

    public static void changeNumber(int number){
        System.out.println("In the method number = " + number);
        number = 0;
        System.out.println("In the method number = " + number);
    }


}


