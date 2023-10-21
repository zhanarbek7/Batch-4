package Day31;

public class Bottle {
    static int numberOfBottlesCreated;
    String size;
    String color;

    public Bottle(String size, String color){
        this.size = size;
        this.color = color;
    }

    public void bottleDetails(){
        System.out.println("This is my bottleDetails method");
        System.out.println(size);
        System.out.println(color);
    }

}
