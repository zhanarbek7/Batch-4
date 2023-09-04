package Day3;

public class PrimitivePractice {

    public static void main(String[] args) {
        int intNumber = 500;
        intNumber = 600;

        int intNumber2 = intNumber;
        System.out.println("intNumber = " + intNumber);
        System.out.println("intNumber2 = " + intNumber2);
        System.out.println("Sum="+intNumber+intNumber2);
        System.out.println("Sum="+(intNumber+intNumber2));

        int intNumber3 = 50;
        byte byteNumber = (byte)intNumber3;
        System.out.println(byteNumber);

        long longNumber = 214383L;
        int intNumber4 = (int)longNumber;
        System.out.println(intNumber4);
    }

}
