package Assignment3;

public class Main {
    public static void main(String[] args) {
        Rectangle rt = new Rectangle(2, 3);
        RtTriangle rTri = new RtTriangle(2, 3);
        Circle cir = new Circle(2.0);

        System.out.println("Rectangle area: " + rt.getArea());
        System.out.println("Rectangle Perimeter: " + rt.getPerimeter());
        System.out.println("Triangle area: " + rTri.getArea());
        System.out.println("Triangle Perimeter: " + rTri.getPerimeter());
        System.out.println("Circle area: " + cir.getArea());
        System.out.println("Circle Perimeter: " + cir.getPerimeter());
        // Change size
        rt.resize(2.0);
        cir.resize(2.0);

        System.out.println("Resized Rectangle area: " + rt.getArea());
        System.out.println("Resized Rectangle Perimeter: " + rt.getPerimeter());
        System.out.println("Resized Circle area: " + cir.getArea());
        System.out.println("Resized Circle Perimeter: " + cir.getPerimeter());
    }

}
