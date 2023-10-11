package Day25.Static;

public class Main {


    public static void main(String[] args) {
        Student student2 = new Student(300);
        Student student3 = new Student(1000);
        Student student1 = new Student(500);

        student1.wallet -= 100;
        Student.moneybox += 100;

        student2.wallet -= 100;
        Student.moneybox += 100;

        student3.wallet -= 100;
        Student.moneybox += 100;

        System.out.println("Student 1 moneybox = " + Student.moneybox);
        System.out.println("Student 2 moneybox = " + Student.moneybox);
        System.out.println("Student 3 moneybox = " + Student.moneybox);


        System.out.println("Student 1 wallet = " + student1.wallet);
        System.out.println("Student 2 wallet = " + student2.wallet);
        System.out.println("Student 3 wallet = " + student3.wallet);


        System.out.println(Student.numberOfStudents);

    }
}
