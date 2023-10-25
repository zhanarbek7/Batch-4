package Day33.person;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void sleep(){
        System.out.println("Sleep");
    }

    public void eat(){
        System.out.println("Eat");
    }
}
