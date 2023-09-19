package day13;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        // if some year is a century then it should be
        // divisible by 400
        // 1869
        // leap: 2000, 2524, 1860
        // not leap: 2500, 1865, 1869

        Scanner scanner = new Scanner(System.in);
        boolean talking = scanner.nextBoolean();
        int hours = scanner.nextInt();

        if(talking && (hours < 7 || hours > 20 )){
            System.out.println("In trouble");
        }
        else{
            System.out.println("We are not in trouble");
        }



    }
}
