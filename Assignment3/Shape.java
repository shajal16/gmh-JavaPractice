package Assignment3;

public abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();

    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public double getNumSides() {
        return numSides;
    }
}
