package Day39;

public class Animal {

    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){
        System.out.println("Assigning new age to " + name);
        if(age<1){
            System.out.println("Given wrong age");
        }
        else{
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("Animal eats");
    }
}
