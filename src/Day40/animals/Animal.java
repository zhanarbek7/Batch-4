package Day40.animals;

public class Animal {
    private String name = "Animal";
    public int number = 0;

    public String getName(){
        return name;
    }

    public void setName(String name){
        System.out.println("Updating name");
        this.name = name;
    }

    public void animal(){
        System.out.println("Animal");
    }

}
