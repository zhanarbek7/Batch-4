package Day33;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor of Animal class");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
}
