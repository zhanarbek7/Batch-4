package Day37.animalInterface;

public class Penguin extends Animal implements SwimAble, DiveAble, WalkAble{

    @Override
    public void swim() {
        System.out.println("Penguin swims");
    }


    @Override
    public void dive() {
        System.out.println("Penguin dives");
    }

    @Override
    public void walk() {
        System.out.println("Penguin walks");
    }

    @Override
    void eat() {
        System.out.println("Penguin eats");
    }
}
