package Day20;

public class Nested {
    public static void main(String[] args) {
//        for(int i = 1; i <= 3; i++){
//            System.out.println("Week " + i);
//            for(int j = 1; j <= 7; j++){
//                System.out.println("Day " + j);
//            }
//        }

//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 5; j++){
//                System.out.println("Hello world");
//            }
//        }


//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= 10; j++){
//                System.out.print(10 + " ");
//            }
//            System.out.println();
//        }


        for(int i = 1; i <= 7; i++){
            for(int j = i; j <= 7; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 7; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
