package Assignment4;

public class Car {
    private String name;
    private int doors;
    private String engine;
    private int wheels;

    // A constructor to initialize
    public Car() {
        wheels = 4;
        name = "Car";
        doors = 4;
        engine = "Engine";
    }

    public Car(String name, String engine, int doors) {
        this.name = name;
        this.doors = doors;
        this.engine = engine;
        System.out.println("Car: " + name + " Engine: " + engine + " door: " + doors);

    }

    public void startEngine() {
        System.out.println("Engine Started");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("Braking");
    }

    public void honk() {
        System.out.println("Beep Beep");
    }

    public void turnLeft() {
        System.out.println("Turning Left");
    }

    public String getName() {
        return this.name;
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}