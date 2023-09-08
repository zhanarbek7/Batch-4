package Day7;

import java.util.Scanner;

public class ManipulationPractice {
    public static void main(String[] args) {
//        String message = "Hello everyone, Let's do Java String exercises";
//        System.out.println(message.charAt(10));
//        System.out.println(message.length());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.toLowerCase());
//        message = message.toUpperCase();
//        System.out.println(message);
//        System.out.println(message.replace(" ","??"));
        Scanner scanner = new Scanner(System.in);
//        String result = scanner.nextLine();
//        System.out.println(result.contains("@"));
//        int length = result.length();
//        System.out.println(length);
//        System.out.println(result.charAt(length-1));
        String word = scanner.nextLine();
        String old = scanner.nextLine();
        String newWord = scanner.nextLine();
//        System.out.println(word.contains(old));
//        System.out.println(word.equalsIgnoreCase(old));

        System.out.println(word.replace(old, newWord));
    }
}
