package Day24;





public class CodingBat {
    public static void main(String[] args) {
//        int[] array = {2,1,2,3,4,5,23,3};
//        System.out.println(numberOfEvens(array)); // 3
//
//        int[] array2 = {1,3,4,5};
//        System.out.println(numberOfEvens(array2)); // 1x
        System.out.println(checkDoubleX("axxbb"));


    }

    // write a method that takes in an array of integers
    // and returns the number of even numbers
    public  int numberOfEvens(int[] array){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }


    // Write a method that takes in a String str and int n
    // This method should return a new String which stores n copies of string str
    // (Hello, 2) ->  HelloHello
    public static String copiesOfString(String str, int n){
        String result = "";
        for(int i = 1; i <= n; i++){
            result += str;
        }
        return result;
    }

    // "xfbatchx"
    public static boolean checkDoubleX(String str){
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                return true;
            }
            else if(str.charAt(i) == 'x' && str.charAt(i+1) != 'x'){
                return false;
            }
        }
        return false;
    }

}
