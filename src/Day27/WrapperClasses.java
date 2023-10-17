package Day27;

public class WrapperClasses {
    public static void main(String[] args) {
        // deprecated -> means old
//        Integer number1 = new Integer(55);
//        Integer number2 = new Integer("55");
        // AUTOBOXING - means converting from primitive to object type


        // String str = "Hello"; -> String Pool
        // String str = new String("Hello"); -> Heap memory

        Integer number1 = 55; // autoboxed by JVM
        Integer number2 = Integer.valueOf("55"); // hardcoded conversion

        Float number3 = 55f; // autoboxed by JVM
        Float number4 = Float.valueOf("55.0f"); // hardcoded conversion

        Character char1 = 'f'; // autoboxed by JVM
        Character char2 = Character.valueOf('f'); // hardcoded conversion

        // Boolean, Long, Byte, Short, Double




    }
}
