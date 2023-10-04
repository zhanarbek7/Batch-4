package Day21;

public class Methods {
    public static void main(String[] args) {
//        int sum = addTwoNumbers(5,7);
//        System.out.println(sum);
//        sayHi();
//        String word = againHi();
//        System.out.println(word);
//        System.out.println(maxNumber(10, 20));
//        sayHelloWorld();
//        System.out.println(sum(5, 6));
//        System.out.println(upper("hello"));
//        System.out.println(method1(55));
//        System.out.println(method1(45));
//        System.out.println(method1(35));

//        System.out.println(length("50"));

        int[] array = {1,22,354,4,55,63,7};
        System.out.println(largestElement(array));
        int[] array1 = {123, 53, 1, 9, -5, 5555};
        System.out.println(largestElement(array1));
    }

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }

    public static void addNumbers(int a, int b){
        System.out.println(a+b);
    }

    public static void sayHi(){
        System.out.println("hi 1");
    }

    public static String againHi(){
        System.out.println("hi 2");
        return "hi 3";
    }

    public static int maxNumber(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }

    public static void sayHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public static void printString(String word){
        System.out.println(word);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static String upper(String word){
        return word.toUpperCase();
    }


    // Write a method that takes an integer as a
    //parameter
    // returns whether it's even or
    //odd.

    public static String method1(int number){
        if(number % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }

//    Write a method that takes a string and returns
//    its length.
    public static int length(String word){
        return word.length();
    }

    // Write a method that takes an array of integers
    //and returns the largest integer in the array.
    public static int largestElement(int[] array){
        int largest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }


    // Write a method that takes three numbers and
    // returns the average.
    public static int average(int n1, int n2, int n3){
        int average = (n1 + n2 + n3) / 3;
        return average;
    }



}
