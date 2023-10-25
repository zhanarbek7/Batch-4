package Day33.person;

public class Teacher extends Person{
    String subject;
    int experience;

    public Teacher(String subject, String name, int age, int experience, String address){
        super(name, age, address);
        this.subject = subject;
        this.experience = experience;
    }

    public void teach(){
        System.out.println(name + " teaches " + subject);
    }

    public void createAssignment(){
        System.out.println(name + " creates a new Assignment");
    }
}
