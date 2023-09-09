package Day8;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        // 1.
        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        int length = word.length();
//        System.out.println("The length of the String is " + length);
//        String word = "Hello";
//        System.out.println(word.substring(2)
//                .substring(1));
        // 2.
        String message = "This is just an example text!u";
//        System.out.println(message.charAt(message.length()-1));
        // 1st way
//        String firstLetter = message.charAt(0) + "";
//        System.out.println(firstLetter.toLowerCase());
//        // 2nd way
//        System.out.println(message.substring(0,1).toLowerCase());
//        // 3rd way
//        System.out.println( message.toLowerCase().charAt(0) );

//        System.out.println(message.toUpperCase().charAt(message.length()-1));

//        String word = scanner.nextLine();
        // Hello Batch4
        // 01234567891011
        // length = 12
//        System.out.println(word.substring(1,word.length()-1));
        // task 4
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        System.out.println(word1.substring(0,2) + word2.substring(word2.length()-2));

        // task 4
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        String a = word1.substring(0,1);
//        String b = word2.substring(word2.length()-1);
//        System.out.println( a + b + b + a );
            // task 5
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
        // word1 = Computer
        // word2 = Folks
//        System.out.print(word1.substring(0, word1.length()/2 ));
//        System.out.println(word2.substring(word2.length()/2));
        // task 6
//        String word = scanner.nextLine();
//        System.out.println(word.endsWith("ly"));
        // task 7
//        String word = scanner.nextLine();
//        System.out.print(word.substring(0,2) + word.substring(3));
        // task 8
        String word = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        word = word.toUpperCase();
        String firstHalf = word.substring(0,start);
        String mid = word.substring(start,end).toLowerCase();
        String secondHalf = word.substring(end);
        System.out.println(firstHalf + mid + secondHalf);
    }

}
