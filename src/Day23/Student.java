package Day23;

// class or a blueprint
public class Student {

    // instance field
    String name;
    int age;
    // Student must have 50 credits to study next year
    int creditsEarned;

    // static method
    public static void someMethod1(){
        System.out.println("STATIC METHOD");
    }

    // instance method
    public void someMethod2(){
        System.out.println("INSTANCE METHOD");
    }

    // instance method
    public void read(){
        System.out.println(name+" can read");
    }

    public void write(){
        System.out.println(name+" can write");
    }

    public String study(){
        return "I can study";
    }

    // boolean method
    // instance method
    public boolean studyNextYear(){
        boolean result = creditsEarned >= 50;
        return result;
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Mike";
        student1.age = 20;
        student1.creditsEarned = 45;

        Student student2 = new Student();
        student2.name = "John";
        student2.age = 23;
        student2.creditsEarned = 70;

        System.out.println("Student1 details");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.creditsEarned);
        student1.read();
        student1.write();
        student1.study();
        System.out.println("Student1 is gonna study next year " + student1.studyNextYear());
        System.out.println();
        System.out.println("Student2 details");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.creditsEarned);
        student2.read();
        student2.write();
        student2.study();
        System.out.println("Student2 is gonna study next year " + student2.studyNextYear());

    }


}
