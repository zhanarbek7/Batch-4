package Day34.employees;

public class Engineer extends Employee{
    String mainProgrammingLanguage;

    public Engineer(String name, String gender, int salary, String mainProgrammingLanguage){
        super(name, gender, salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    public void engineerMethod(){
        System.out.println("Engineer");
    }
}
