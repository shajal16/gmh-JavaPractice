package Assignment3;

public class RtTriangle extends Shape {
    private double height;
    private double width;

    public RtTriangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 3 * width;
    }

}
