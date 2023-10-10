package Day24;

public class Student {
    String name;
    int age;
    double gpa;
    String gender;
    boolean bestStudent;

    // Constructor with parameters
    public Student(String name, int age, double gpa, String gender,
                   boolean bestStudent){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.gender = gender;
        this.bestStudent = bestStudent;
    }

    // Constructor with parameters
    public Student(String name, int age, double gpa, String gender){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.gender = gender;
    }


    public static void main(String[] args) {
        Student student = new Student("John", 25, 4.0,
                "MALE", true);
        Student student2 = new Student("Mike", 22, 3.0, "MALE");

        student.myDetails();
        student.read();

        student2.myDetails();
        student2.read();

    }

    public void read(){
        System.out.println(name + " can read");
    }

    public void myDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);
        System.out.println(gender);
        System.out.println(bestStudent);
    }
}
