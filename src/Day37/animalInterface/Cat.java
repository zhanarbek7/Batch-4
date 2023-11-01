package Day37.animalInterface;

public class Cat extends Animal implements WalkAble{
    @Override
    void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void walk() {
        System.out.println("Cat walks");
    }
}
