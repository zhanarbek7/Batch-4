package Day28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TODOList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>(
                List.of("Groceries","Gym","Insurance","Assignments",
                "Buy a smartphone"));
//        // Run following 5 times
//        for(int i = 1; i <= 5; i++){
//            System.out.println("Enter task "+ i);
//            String task = scanner.nextLine();
//            todoList.add(task);
//        }
        while(true){
            displayTasks(todoList);
            System.out.println("Which task did you finish?");

            int task = scanner.nextInt();
            todoList.remove(task - 1 );
            if(task == 0){
                break;
            }
        }

    }

    public static void displayTasks(ArrayList<String> tasks){
        System.out.println("--------------------");
        for(int i = 0; i < tasks.size(); i++){
            System.out.println(i+1 + ". " + tasks.get(i));
        }
        System.out.println("--------------------");
    }
}
