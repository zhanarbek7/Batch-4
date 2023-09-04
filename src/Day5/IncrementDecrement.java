package Day5;

public class IncrementDecrement {
    public static void main(String[] args) {
        int number= 10;
        System.out.println(--number); // 9
        System.out.println(number--); // 9
        System.out.println(number); // 8
        System.out.println(++number); // 9
        System.out.println(number++); // 9
        System.out.println(number); // 10
        int number2 = ++ number;
        System.out.println(number2); // 11
    }
}
