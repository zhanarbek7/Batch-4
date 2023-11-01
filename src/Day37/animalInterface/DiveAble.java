package Day37.animalInterface;

public interface DiveAble {
    int number = 50;
    void dive();

    static void staticMethod(){

    }

    default void defaultMethod(){

    }
}
