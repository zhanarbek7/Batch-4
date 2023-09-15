package Day10;

import java.util.Scanner;

public class ParrotTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean talking = scanner.nextBoolean();
        int hours = scanner.nextInt();
        if(talking && hours < 7 || hours > 20){
            System.out.println("BAD PARROT");
        }
        else{
            System.out.println("GOOD PARROT");
        }

    }
}
