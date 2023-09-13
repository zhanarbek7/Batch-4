package Day10;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if(word.contains("o") && word.length() <= 6){
            System.out.println("Interesting word");
        }
        else if(word.contains("o") && word.length()>6){
            System.out.println("Super Interesting word");
        }
        else{
            System.out.println("Boring word");
        }

    }
}
