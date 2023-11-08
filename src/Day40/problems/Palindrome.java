package Day40.problems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";

        // for loop -> reverse a String, and store it letter by letter
        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }

        // compare
        System.out.println(str.equals(reversed));



    }
}
