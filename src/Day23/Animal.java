package Day23;

public class Animal {
    String name;
    int age;
    String color;


    // instance method
    public void animalPassport(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
    }

    public void eat(){
        System.out.println(name + " can eat");
    }

    public void sleep(){
        System.out.println(name + " can sleep");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Lion";
        animal1.age = 5;
        animal1.color = "black";

        Animal animal2 = new Animal();
        animal2.name = "Python";
        animal2.age = 10;
        animal2.color = "green";

        Animal animal3 = new Animal();
        animal3.name = "Dog";
        animal3.age = 4;
        animal3.color = "white";

        Animal animal4 = new Animal();
        animal4.name = "horse";
        animal4.age = 7;
        animal4.color = "grey";

        Animal animal5 = new Animal();
        animal5.name = "cat";
        animal5.age = 3;
        animal5.color = "yellow";

        animal1.animalPassport();
        animal1.eat();
        animal1.sleep();

        animal2.animalPassport();
        animal2.eat();
        animal2.sleep();

        animal3.animalPassport();
        animal3.eat();
        animal3.sleep();

        animal4.animalPassport();
        animal4.eat();
        animal4.sleep();

        animal5.animalPassport();
        animal5.eat();
        animal5.sleep();
    }
}
