package Day35.Shape;

public class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(length * width);
    }
}
