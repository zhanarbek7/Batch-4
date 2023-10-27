package Day34.employees;

public class Accountant extends Employee{

    public Accountant(String name, String gender, int salary){
        super(name, gender, salary);
    }

    public void accountantMethod(){
        System.out.println("Accountant");
    }

}
