package Day42;

public class ConstructorChaining {

    public ConstructorChaining(){
        System.out.println("Empty constructor");
    }

    public ConstructorChaining(int parameters){
        System.out.println("Constructor with parameters");
    }

    public void method(){}

    public void method2(){
        method();
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining();
    }
}
