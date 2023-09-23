package Day16;

public class Main {
    public static void main(String[] args) {

        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isDigit('%'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetter('e'));
        System.out.println(Character.isLetter('&'));
        System.out.println(Character.isLetterOrDigit('&'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isLetterOrDigit('p'));

        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(str);
    }
}
