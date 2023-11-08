package Day40.animals;

public class Lion extends Animal{
    int year = number;
    String str1 = super.getName();
    String str2 = getName();
    String str3 = str1;

    public String getName(){
        return "Lion";
    }

    public void setStr1(String str1){
        this.str1 = str1;
    }

    public void animal(){
        System.out.println("Lion");
    }


    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.year); // 0
        System.out.println(lion.str1); // Animal
        System.out.println(lion.str2); // Lion
        System.out.println(lion.str3);


        method();

        System.out.println(lion.getName());
        lion.setName("Lion2");
    }


    public static void method(){}

    public static int method(int a ){
        return 5;
    }
}
