package Day38.students;

public class LocalStudent extends Student implements GovernmentScholarship, UniversityScholarship{
    public LocalStudent(String name, int age, double gpa) {
        super(name, age, gpa);
    }


    @Override
    public void getUniversityScholarship() {
        if(gpa >= 3.4){
            System.out.println("Local student " + name + " is eligible for University scholarship");
        }
        else {
            System.out.println("Local student " + name + " isn't eligible for University scholarship");
        }
    }

    @Override
    public void getGovernmentScholarship() {
        if(gpa >= 3.2){
            System.out.println("Local student" + name + " is eligible for Government scholarship");
        }
        else{
            System.out.println("Local student" + name + " isn't eligible for Government scholarship");
        }
    }
}
