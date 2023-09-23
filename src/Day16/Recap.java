package Day16;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
        // task 1
//        while(number % 2 != 1){
//            System.out.println("Hello world");
//            number%=2;
//        }
//        System.out.println("Good job!");
        // task 2
        // microphoneIsaDevice
        String word = scanner.nextLine();
        int j = 0;
        while (j < word.length()) {
            System.out.println(word.charAt(j) + ", " + (j) + ", " + Character.isLetterOrDigit(word.charAt(j)));
            j++;
//
        }

//            micro
//            m, 1, true
//            i, 2, true
//            c, 3, true
//            r, 4, true
//            o, 5, true
//            1, 6, true
//            2, 7, true
//            %, 8, false
//            *, 9, false
    }
}
