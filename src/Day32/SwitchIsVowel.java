package Day32;

public class SwitchIsVowel {
    public static void main(String[] args) {
        char letter = 'A';
        int n = 5;
        switch (letter){
            case 'A','E','I','O','U' -> System.out.println("vowel");
            default -> System.out.println("consonant");
        }

    }
}
