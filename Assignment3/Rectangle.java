package Assignment3;

public class Rectangle extends Shape implements Resizable {
    private double height;
    private double width;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public void resize(double x) {
        width *= x;
        height *= x;
    }

}
