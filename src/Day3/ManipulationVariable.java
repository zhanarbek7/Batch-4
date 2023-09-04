package Day3;

public class ManipulationVariable {
    public static void main(String[] args) {
//        Create a java class named ManipulationVariable, with main method
//        1.1 Declare a variable x and assign value 7.5
//        1.2 Declare a variable y and assign value 2 times bigger than x variable
//        1.3 Declare a variable z and assign value 3 times bigger than y and plus x
//        variables value
//        1.4 Declare a variable p and assign one third of y variable
//        1.5 Print all variables in new lines
        double x = 7.5;
        double y = x * 2; // y = 15.0
        double z = y * 3 + x; // z = 15.0 * 3 + 7.5 = 52.5
        double p = y / 3;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("p = "+p);
    }


}
