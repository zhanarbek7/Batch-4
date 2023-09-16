package Day11;

import java.util.Scanner;

public class TwoFactorAuthorization {
    public static void main(String[] args) {
        String correctEmail = "codewise@gmail.com";
        String correctPassword = "Codewiser!";
        int correctOneTimePasscode = 9532;

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String password = scanner.nextLine();
        int oneTimePasscode;

        if(email.equals(correctEmail) && password.equals(correctPassword)){
            System.out.println("Email and password are correct");
            System.out.println("4-digit passcode sent to your phone");
            oneTimePasscode = scanner.nextInt();
            if(oneTimePasscode == correctOneTimePasscode){
                System.out.println("You are authorized");
            }
            else{
                System.out.println("You are not authorized!");
            }
        }
        else if(!email.equals(correctEmail) && !password.equals(correctPassword)){
            System.out.println("Email is wrong");
            System.out.println("Password is wrong");
        }
        else if(email.equals(correctEmail) && !password.equals(correctEmail)){
            System.out.println("Email is correct");
            System.out.println("Password is wrong");
        }
        else{
            System.out.println("Email and password aren't correct");
        }


    }

}
