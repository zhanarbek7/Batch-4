package Day23;

public class Animal2 {
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

        Animal[] animals = {animal1, animal2, animal3, animal4, animal5};

        for(int i = 0; i < animals.length; i++){
            animals[i].animalPassport();
            animals[i].eat();
            animals[i].sleep();
            System.out.println();
        }
    }
}
