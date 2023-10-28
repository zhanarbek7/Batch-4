package Day35.employees;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Employee1",6000,
                250);

        ContractEmployee contractEmployee = new ContractEmployee("Employee2", 7000,
                24);

        fullTimeEmployee.calculateSalary();
        contractEmployee.calculateSalary();
        contractEmployee.calculateSalary(35, 400);
    }
}
