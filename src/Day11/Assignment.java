package Day11;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        // I am looking for some good word
        if(email.contains("@") && email.length() >= 10
        && (email.endsWith(".com") || email.endsWith(".org")
        || email.endsWith(".net"))){
            System.out.println("Good email");
        }
        else{
            System.out.println("Bad email");
        }




    }
}
