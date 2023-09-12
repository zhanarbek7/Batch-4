package Day9;

public class Assignment {
    public static void main(String[] args) {
        String str = "  This is a random string for testing purposes  ";
        String randomWord = str.substring(12,18).toUpperCase();
        System.out.println("" + randomWord.charAt(5)+randomWord.charAt(4)+randomWord.charAt(3)
                +randomWord.charAt(2) + randomWord.charAt(1) + randomWord.charAt(0));

        System.out.println(randomWord.charAt(5) + randomWord.charAt(4) + randomWord.charAt(3)
                +randomWord.charAt(2) + randomWord.charAt(1) + randomWord.charAt(0));

        String str5 = "Learn as if you will live forever, live like you will die tomorrow";
//        str5 = str5.replace("o","");
//        System.out.println(str5.replace(" ",""));
        System.out.println(str5.replace("o","")
                .replace(" ",""));
    }
}
