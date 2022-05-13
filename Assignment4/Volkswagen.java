package Assignment4;

public class Volkswagen extends Car {
    private String model;
    private int seats;

    public Volkswagen() {
        super();
        System.out.println("Volkswagen CAR has " + super.getWheels() + " Wheels");
    }

    public Volkswagen(String name, String engine, int doors, String model, int seats) {
        super(name, engine, doors);
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
