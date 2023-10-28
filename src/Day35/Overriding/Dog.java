package Day35.Overriding;

public class Dog extends Animal{

    @Override
    public void animalSound() {
        System.out.println("Dog barks");
    }

    public void dog(){
        System.out.println("DOG");
    }
}
