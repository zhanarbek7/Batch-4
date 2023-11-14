package Day43.login;

import java.util.Scanner;

public class Login {

    static final String username = "codewise";
    static final String password = "codewise123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sUsername = scanner.nextLine();
        String sPassword = scanner.nextLine();

        if(username.equals(sUsername) &&
        password.equals(sPassword)){
            System.out.println("Access granted!");
        }
        else if(!username.equals(sUsername)){
            try {
                throw new EmailNotFoundException("Email was not found!");
            }
            catch (EmailNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        else{
            try {
                throw new InvalidCredentialsException("Incorrect credentials!");
            }
            catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
