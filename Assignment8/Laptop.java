package Assignment8;

public class Laptop {
    public static void main(String[] args) {
        Charger ch = new Charger();
        ch.start();

        synchronized (ch) {
            try {
                System.out.println("waiting to connect charger");
                ch.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Charger is Connected");
        }
    }
}

class Charger extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            notify();
        }
    }
}
