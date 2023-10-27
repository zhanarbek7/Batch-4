package Day34.employees;

public class Manager extends Employee{
    String department;

    public Manager(String name, String gender, int salary, String department){
        super(name, gender, salary);
        this.department = department;
    }

    public void managerMethod(){
        System.out.println("Manager");
    }
}
