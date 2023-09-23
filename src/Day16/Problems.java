package Day16;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // task 3
//        int i = 1;
//        while(i<=5){
//            int money = scanner.nextInt();
//            if(money>=1100){
//                System.out.println("You bought a new IPhone");
//            }
//            else{
//                System.out.println("You can't buy a new IPhone");
//            }
//            i++;
//        }

//        int number = scanner.nextInt();
//        while(number % 2 != 1){
//            System.out.println("Hello world");
//            number%=2;
//        }
//        System.out.println("Good job!");
        // do while loop
//        int j = 1000;
//        do{
//            System.out.println("Hello world");
//            j++;
//        } while(j<=10);


        String word = scanner.nextLine();
        int counter1 = 0, counter2 = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isDigit(ch)){
                counter1++;
            }
            else if(Character.isLetter(ch)){
                counter2++;
            }
        }
        System.out.println("I found " + counter1 + " digits.");
        System.out.println("I found " + counter2 + " letters");

    }
}
