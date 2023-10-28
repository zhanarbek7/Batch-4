package Day35.Overriding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cow cow = new Cow();
        ArrayList<Animal> animals = new ArrayList<>(List.of(dog,cow));

//        animal.animalSound();
//        dog.animalSound();
//        cow.animalSound();

        Animal animal1 = new Dog();

        Dog dog2 = new Dog();



    }
}
