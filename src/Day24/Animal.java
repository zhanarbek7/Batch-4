package Day24;

public class Animal {
    String name;
    int age;



    // Constructor with parameters
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Animal(String name){

    }

    public static void main(String[] args) {
        Animal animal = new Animal("Lion");
        Animal animal2 = new Animal("Dog");
        Animal animal3 = new Animal("Cat",12);

        System.out.println("-----------------");
        System.out.println(animal.name);
        System.out.println(animal.age);

        System.out.println(animal2.name);
        System.out.println(animal2.age);

        System.out.println(animal3.name);
        System.out.println(animal3.age);

    }


}
