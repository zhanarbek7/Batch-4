package Day39.ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Task> completedTasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
        System.out.println(task.getName() + " was added!");
    }

    public void displayTasks(){
        System.out.println("--------------------");
        System.out.println("Current tasks:");
        int counter = 1;
        for (Task task : tasks) {
            System.out.println(counter +". "+ task.getName() + ", Due Date: " + task.getDueDate());
            counter++;
        }
    }

    public void displayCompletedTasks(){
        System.out.println("--------------------");
        System.out.println("Completed tasks:");
        int counter = 1;
        for (Task task : completedTasks) {
            System.out.println(counter + ", " + task.getName() + ", Due Date: " + task.getDueDate());
        }
    }

    public void completeATask(String name){
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getName().equals(name)){
                completedTasks.add(tasks.get(i));
                tasks.remove(i);
                break;
            }
        }
    }
}
