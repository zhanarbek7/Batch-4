package Day25.Static;

public class Student {
    static int moneybox;
    static int numberOfStudents;

    int wallet;

    public Student(int wallet){
        this.wallet = wallet;
        numberOfStudents++;
    }


    public static void staticMethod(){
        System.out.println("Static method");
    }

    public void instanceMethod(){
        System.out.println("Instance method");
    }



}
