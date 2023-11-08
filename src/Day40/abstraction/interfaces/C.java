package Day40.abstraction.interfaces;

public class C extends B implements A{
    @Override
    public void abstractMethod() {
        System.out.println("Implementation");
    }
}
