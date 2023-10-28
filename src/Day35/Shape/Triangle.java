package Day35.Shape;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(0.5 * base * height);
    }
}
