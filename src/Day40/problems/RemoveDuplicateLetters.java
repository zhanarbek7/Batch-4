package Day40.problems;

import java.util.LinkedHashSet;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "goodmorningevening";
        String uv = "";
        for (int i = 0; i < str.length(); i++) {
            if(!uv.contains(String.valueOf(str.charAt(i)))){
                uv+= str.charAt(i);
            }
        }
        System.out.println(uv);
    }
}
