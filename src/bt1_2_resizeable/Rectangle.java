package bt1_2_resizeable;

public class Rectangle extends Shape implements Resizeable{
    private double weight = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double weight, double height) {
        super(color, filled);
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return weight * height;
    }
    public double getPerimeter() {
        return (weight + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height + ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(int percent) {
        this.weight = weight * percent / 100 + weight;
        this.height = height * percent / 100 + height;
    }
}

class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public void setSide(double side) {
        super.setHeight(side);
        super.setWeight(side);
    }
    public double getSide(){
        return getHeight();
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of" + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
