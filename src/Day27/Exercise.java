package Day27;

public class Exercise {
    public static void main(String[] args) {
        String intNumber = "19932";
        // Integer.valueOf() returns Integer
        // Integer.parseInt() return int
        int number2 = Integer.parseInt(intNumber);

        String doubleNumber = "49.99";
        double number3 = Double.parseDouble(doubleNumber);

        String strBool = "false";
        boolean bool = Boolean.parseBoolean(strBool);

        String intWrap = "1343";
        Integer number4 = Integer.valueOf(intWrap);

        String shortWrap = "354";
        Short number5 = Short.valueOf(shortWrap);

        String byteWrap = "31";
        Byte number6 = Byte.valueOf(byteWrap);

        Integer intObj = Integer.valueOf("200");
        String str = String.valueOf(intObj);

        Integer intObj2 =Integer.valueOf("200");
        int number7 = intObj2; // auto unboxing

        Boolean boolObj= Boolean.valueOf("true");
        String str2 = String.valueOf(boolObj);

        Boolean boolObj2 = Boolean.valueOf("true");
        boolean bool2 = boolObj2.booleanValue(); // unboxing

        Double number8 = Double.valueOf("20.9");
        String str3 = String.valueOf(number8);

        Double number9 = Double.valueOf("99.3");
        double double2 = number9.doubleValue(); // unboxing


    }
}
