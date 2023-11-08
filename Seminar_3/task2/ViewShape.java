import lsp.*;

public class ViewShape {
    private final Shape shape;

    public ViewShape(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.printf("Площадь: %d\n", shape.getArea());
    }
}
