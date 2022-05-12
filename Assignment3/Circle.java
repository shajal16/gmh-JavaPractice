package Assignment3;

public class Circle extends Shape implements Resizable {
    private double radius;

    public Circle(double radius) {
        super(0);
        this.radius = radius;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void resize(double x) {
        radius *= x;
    }

}