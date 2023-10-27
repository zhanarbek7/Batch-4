package Day34.employees;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John","M",8000,"Sales");
        Engineer engineer = new Engineer("Lisa","F",9500,
                "Java");
        Engineer engineer1 = new Engineer("Ann","F",9000,
                "JavaScript");
        Accountant accountant = new Accountant("Jerry", "M",6500);

        ArrayList<Employee> employees = new ArrayList<>(List.of(manager, engineer, engineer1,
                accountant));


        for(Employee employee: employees){
            employee.details();
            if(employee instanceof Manager){
                System.out.println(((Manager) employee).department);
            }
            else if(employee instanceof Engineer){
                System.out.println(((Engineer) employee).mainProgrammingLanguage);
            }
            System.out.println();
        }

    }
}
