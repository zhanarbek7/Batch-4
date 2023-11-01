package Day37.animalInterface;

public class Fish extends Animal implements SwimAble, DiveAble{
    @Override
    void eat() {
        System.out.println("Fish eats");
    }

    @Override
    public void dive() {
        System.out.println("Fish dives");
    }

    @Override
    public void swim() {
        System.out.println("Fish swims");
    }
}
