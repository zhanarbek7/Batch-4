package day13;

import java.util.Scanner;

public class ClassCode {
    public static void main(String[] args) {

//        for(int i = 1; i <= 10; i++){
//            System.out.println(i + " * " + "3" + " = "+ i * 3);
//        }
//
//        for(int i = 100; i >= 1; i/=2){
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println("2 * " + i + " = " + i * 2);
//        }

//        for (int x = 1; x <= 15; x+=2) {
//            System.out.println("The value of x is = "+ x);
//        }
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
            System.out.println("The value of i is " + i);
        }
        System.out.println("The sum of first 10 numbers is: " + sum);

    }
}
