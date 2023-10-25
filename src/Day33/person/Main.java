package Day33.person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Math","John",46, 24,
                "Address1");

        Teacher teacher2 = new Teacher("Physics","Mike",46, 24,
                "Address2");

        Student student1 = new Student("Lisa", 23, "Address3",
                11, "Math");

        ArrayList<Person> people = new ArrayList<>();

        people.add(teacher1);
        people.add(teacher2);
        people.add(student1);



    }
}
