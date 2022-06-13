package bt1_2_resizeable;


public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius
                + ", which is a subclass of" + super.toString() +
                '}';
    }

    @Override
    public void resize(int percent) {
        this.radius = radius * percent / 100 + radius;
    }
}
