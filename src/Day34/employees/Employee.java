package Day34.employees;

public class Employee {
    String name;
    String gender;
    int salary;

    public Employee(String name, String gender, int salary){
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public void employeeMethod(){
        System.out.println("Employee");
    }

    public void details(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(salary);
    }
}
