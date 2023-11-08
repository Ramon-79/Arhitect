import lsp.*;

public class Main {
    public static void main(String[] args) {
        Square shape1 = new Square(5);
        shape1.setSide(4);
        System.out.printf("Сторона квадрата: %d\n", shape1.getSide());
        ViewShape view = new ViewShape(shape1);
        view.showArea();
    }
}
