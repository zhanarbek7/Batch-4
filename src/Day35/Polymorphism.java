package Day35;

public class Polymorphism {
    String name;

    public Polymorphism(String name){
        this.name = name;
    }

    public Polymorphism(){

    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        sum(2,3,5); // calls 2nd sum() method

        polymorphism.sum(2,5); // calls instance sum() method

        sum(5.0, 3); // calls 3rd sum() method
        System.out.println(sum(20, 30, 1.0));
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(double a, int b){
        System.out.println(a+b);
    }

    public static int sum(int a, int b, double c){
        return (int)(a + b + c);
    }

}
