package Day38.students;

public class InternationalStudent extends Student implements UniversityScholarship{

    public InternationalStudent(String name, int age, double gpa) {
        super(name, age, gpa);
    }

    @Override
    public void getUniversityScholarship() {
        if(gpa >= 3.8){
            System.out.println("International student " + name + " is eligible for University scholarship");
        }
        else{
            System.out.println("International student " + name + " isn't eligible for University scholarship");
        }
    }
}
