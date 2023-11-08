package Day40.abstraction.interfaces;

public interface A {
    double PI = 3.14;

    void abstractMethod();

    default void defaultMethod(){
        System.out.println("Default Method");
    }
}
