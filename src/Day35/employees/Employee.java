package Day35.employees;

public class Employee {
    String name;
    int employeeId;
    double salary;
    static int nEmployees = 0;

    public Employee(String name, double salary){
        nEmployees++;
        this.employeeId = nEmployees;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary(){
        System.out.println(salary);
    }
}
