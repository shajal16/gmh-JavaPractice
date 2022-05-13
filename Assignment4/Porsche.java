package Assignment4;

public class Porsche extends Car {
    private String model;

    public Porsche() {
        System.out.println("Its a Porshe");
    }

    public Porsche(String name, String engine, int doors, int seats, String model) {
        super(name, engine, doors);
        this.model = model;
    }

    public void honk() {
        System.out.println("HONK HONK HONK");
    }

    public void accelerate(int speed) {
        System.out.println(super.getName() + " " + this.model + " Accelerating to " + speed + "mph");
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
