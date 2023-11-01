package Day37.animalInterface;

public class Shark extends Animal implements SwimAble, DiveAble{
    @Override
    public void dive() {
        System.out.println("Shark dives");
    }

    @Override
    public void swim() {
        System.out.println("Shark swims");
    }

    @Override
    void eat() {
        System.out.println("Shark eats");
    }
}
