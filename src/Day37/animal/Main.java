package Day37.animal;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Shark shark = new Shark();

        bird.dive();
        bird.fly();
        bird.swim();
        bird.walk();

        shark.fly();

    }
}
