package Day22;

public class Exercises {
    public static void main(String[] args) {
//        String str = "good";
//        reverseString(str);
//        int[] array = {1,2,3,4,9,5,6,5,9};
//        int number = 9;
//        isPresent(array, number);

//        System.out.println(removeLetters("*computers*"));
//        skipLettersE("hello what a nice day");
//        checkPassword("pa@");
        int[] array = {1,2,3,4,5,13,55,2,3,4};
        sumUntil13(array);
    }

    public static String removeLetters(String word){
        return word.substring(1,word.length()-1);
    }

    public static void reverseString(String word){
        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }

    public static boolean methodReturnBreak(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            if(i==7){
                return true;
            }
        }
        System.out.println("Hello world");
        return false;
    }

    public static void isPresent(int[] array, int number){
        boolean present = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                present = true;
                break;
            }
        }
        System.out.println(present);
    }

    public static void skipLettersE(String word){
        //hello what a nice day
        //hllo what a nic day
        System.out.println(word.replace("e",""));
    }

    public static void checkPassword(String password){
        System.out.println(password.length() >=10 && password.contains("@"));
    }

    public static void sumUntil13(int[] integers){
        int sum = 0;
        for(int i = 0; i < integers.length; i++){
            if(integers[i] == 13){
                break;
            }
            sum+= integers[i];
        }
        System.out.println(sum);
    }
}
