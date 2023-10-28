package Day35.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(4, 6);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();

        ArrayList<Shape> shapes = new ArrayList<>(List.of(circle, rectangle, triangle));
        for (Shape i: shapes) {
            if(i instanceof Circle){
                System.out.println("Circle");
                System.out.println("Radius: "+((Circle) i).radius);
            }
            else if(i instanceof Rectangle){
                System.out.println("Rectangle");
                System.out.println("Length: "+((Rectangle) i).length);
                System.out.println("Width : "+((Rectangle) i).width);
            }
            else{
                System.out.println("Triangle");
                System.out.println("Base: "+((Triangle) i).base);
                System.out.println("Height: "+((Triangle) i).height);
            }
            System.out.println("---------------");
        }

    }
}
