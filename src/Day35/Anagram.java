package Day35;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "sslent";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2){
        char[] chars1 = str1.toCharArray(); // ['l','i','s','t','e','n']
        char[] chars2 = str2.toCharArray(); // ['s','i','l','e','n','t']

        Arrays.sort(chars1); // ['e','i','l','n','s','t']
        Arrays.sort(chars2); // ['e','i','l','n','s','t']
        return Arrays.equals(chars1,chars2);
    }
}
