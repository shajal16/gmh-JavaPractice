package Assignment4;

public class Bmw extends Car {
    private String model;
    private int doors;

    public Bmw() {
        super();
        System.out.println("BMW CAR has " + super.getWheels() + " Wheels");
    }

    public Bmw(String name, String engine, int doors, String model) {
        super(name, engine, doors);
        this.model = model;
        this.doors = doors;
    }

    public void startEngine(String name) {
        System.out.println(super.getName() + model + " " + "Engine Started");
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}
