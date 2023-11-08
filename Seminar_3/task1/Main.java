import ocp.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));

        double sumArea = 0;
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " - " + shape.getArea());
            sumArea += shape.getArea();
            }

        System.out.printf("Площадь: %f\n", sumArea);
    }
}
