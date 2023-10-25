package Day33.person;

public class Student extends Person{

    int grade;
    String favoriteSubject;

    public Student(String name, int age, String address, int grade, String favoriteSubject) {
        super(name, age, address);
        this.grade = grade;
        this.favoriteSubject = favoriteSubject;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

}
