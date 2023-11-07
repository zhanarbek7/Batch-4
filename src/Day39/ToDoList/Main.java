package Day39.ToDoList;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ToDoList mobile APP.");
        ToDoList toDoList = new ToDoList();
        int choice = 0;
        Task task;

        while(choice!=5){
            System.out.println("----------------");
            System.out.println("1. Create a task");
            System.out.println("2. Display current tasks");
            System.out.println("3. Display completed tasks");
            System.out.println("4. Complete a task by name");
            System.out.println("5. Stop the program");

            System.out.print("Choose a menu button: ");
            choice = scanner.nextInt();;
            switch (choice){
                case 1 -> {
                    scanner.nextLine();
                    System.out.print("Enter name for a task: ");
                    String taskName = scanner.nextLine();

                    System.out.print("Enter due date in this format YYYY-MM-dd: ");
                    String dueDate = scanner.nextLine();
                    LocalDate date = LocalDate.parse(dueDate);
                    task = new Task(taskName, date);
                    toDoList.addTask(task);
                }
                case 2 -> {
                    toDoList.displayTasks();
                }
                case 3 -> {
                    toDoList.displayCompletedTasks();
                }
                case 4 ->{
                    scanner.nextLine();
                    System.out.print("Enter name for a task to complete: ");
                    String taskName = scanner.nextLine();
                    toDoList.completeATask(taskName);
                }
            }
        }

    }
}
