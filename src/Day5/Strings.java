package Day5;

public class Strings {


    public static void main(String[] args) {
        // 1 - literal way
        String literalString = "literalString"; // This string is stored in String pool
        String literalString2 = "literalString"; //
        System.out.println(literalString == literalString2);
        // 2nd - new object of String
        String someString = new String("literalString");
        System.out.println(literalString == someString);
        System.out.println(literalString.equals (someString));
        System.out.println(literalString != someString);

    }
}
