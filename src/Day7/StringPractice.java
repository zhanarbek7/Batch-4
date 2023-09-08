package Day7;

public class StringPractice {
    public static void main(String[] args) {
        String stringVariable = "Good evening Batch4!";
        int year = 2023;
        // String non-primitive data type, is a class
        // String is immutable
//        System.out.println(stringVariable.length());
        String str1 = "Hello";
        String str2 = "";
        String str3 = "Hello Batch4 !";
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(stringVariable.toLowerCase());
//        System.out.println(stringVariable.toUpperCase());
//        System.out.println(stringVariable.charAt(18));
//        System.out.println(stringVariable.charAt(3));
//        System.out.println(stringVariable.charAt(stringVariable.length()-1));

//        System.out.println(str1.indexOf("e"));
//        System.out.println(str1.indexOf("l"));
//        System.out.println(str1.indexOf("o"));
//        System.out.println(str3.indexOf("Batch"));
//        System.out.println(str2.isEmpty());
//        System.out.println(str1.replace("H","B"));// Bello
//        System.out.println(str1.endsWith("llo"));
//        System.out.println(str1.trim());
        // Hello -> lo
        // Hello -> ello
        // Hello -> llo
        // Good evening Batch4! ->
//        System.out.println(str1.substring(3));
//        System.out.println(str1.substring(1));
//        System.out.println(str1.substring(2,5));
//        System.out.println(stringVariable.substring(7, 15));
        System.out.println(stringVariable.contains("!"));
    }
}
