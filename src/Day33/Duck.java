package Day33;

public class Duck extends Animal{

    int number = 4;

    public Duck(String name, int age){
        super(name,age);
        System.out.println("Constructor of Duck class");
    }


    public void fly(){
        System.out.println(number);
        System.out.println(name);
        System.out.println(age);
        System.out.println("Duck is flying");
    }

}
