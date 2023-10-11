package Day25.Calculator;

public class Calculator {

    public void add(int x, int y){
        System.out.println(x+y);
    }

    public void subtract(int x, int y){
        System.out.println(x - y);
    }

    public void multiply(int x, int y){
        System.out.println(x * y);
    }

    public void divide(int x, int y){
        if(y!=0){
            System.out.println(x / y);
        }
    }

    public void modulus(int x, int y){
        System.out.println(x % y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(5,6);
        calculator.subtract(25,1);
        calculator.multiply(3,4);
        calculator.divide(10,5);
        calculator.modulus(5,4);
    }
}
