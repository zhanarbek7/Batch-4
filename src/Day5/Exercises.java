package Day5;

public class Exercises {
    public static void main(String[] args) {
//        int p = 9;
//        System.out.println("The value of p is " +p);
//        System.out.println("The square of p is "+ p*p);
//
//        int number1 = 15;
//        System.out.println(number1*10);

        int x = 25;
//        System.out.println(x%2 == 1);

//        int year = 2023;
//        System.out.println(year%10);

//        System.out.println(x%12 == 0);
        // 13363 % 29 = 23
//        System.out.println(x%29 == 1);
        int batch4 = 123;
//        System.out.println(batch4%100);
        int firstDigit = batch4 / 100;
        int secondDigit = batch4 / 10 % 10;
        int lastDigit = batch4 % 10;
        System.out.println(firstDigit + "," + secondDigit + "," + lastDigit);

    }
}
