package Day25.ApartmentManagement;

public class ApartmentMain {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(2,
                1000, 2000);

        Person person1 = new Person("Mike",20, "M");
        Person person2 = new Person("Ann", 25, "F");
        Person person3 = new Person("John", 18, "M");
        Person person4 = new Person("David", 22, "M");

        apartment1.people[0] = person1;
        apartment1.people[1] = person2;
        apartment1.people[2] = person3;
        apartment1.people[3] = person4;

        person1.myDetails();
        person2.myDetails();
        person3.myDetails();
        person4.myDetails();

    }
}
