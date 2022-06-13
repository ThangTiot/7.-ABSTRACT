package bt1_2_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 5);
        shapes[2] = new Square(2);
        for (Shape object : shapes) {
            if (object instanceof Square) {
                Square square = (Square) object;
                square.howToColor();
            }
            System.out.println(object);
        }
        Circle circle = (Circle) shapes[0];
        circle.resize(10);
        System.out.println(circle);
        Rectangle rectangle = (Rectangle) shapes[1];
        rectangle.resize(10);
        System.out.println(rectangle);
        Resizeable resizeable = (Square) shapes[2];
        resizeable.resize(10);
        System.out.println(resizeable);

    }
}
