package Assignment4;

public class MainClass {
    public static void main(String[] args) {
        Car bmw = new Bmw();
        Car vg = new Volkswagen();
        Car ps = new Porsche();
        Car bmw1 = new Bmw("BMW", "I6", 2, "Z4");
        bmw.setEngine("v2");
        bmw.startEngine();
        bmw.setEngine("UNKNOWN");

        Bmw bmw2 = new Bmw();

        System.out.println(bmw2.getName());
        bmw1.honk();

        vg.honk();
        ps.honk();

        Volkswagen vg1 = new Volkswagen();

        vg1.accelerate();

        Porsche ps1 = new Porsche("Porsche", "6-Cyl 4.0 Liter", 2, 2, "718 Spyder");
        ps1.accelerate(150);
        System.out.println(ps1.getEngine());
        /**
         * A) To achieve inheritace I extended Car class in class Bmw, Porsche and
         * Volkswagen
         * here through created a Car object bmw to get constructors of bmw class which
         * can also access Car methods.
         * but it can not access bmw methods as bmw is a super class Car object. then
         * created bmw1 object of class Bmw which can access all Car and Bmw methods.
         * 
         * B) I have used both overriding and overloading here. ps.honk() overrides
         * Super class method honk and prints HONK HONK HONK instead of beep beep.
         * in ps1.accelerate(speed) method I have used overload where using the same
         * method name from super class I have passed parameter this time. Thgoiurh that
         * I have demonstrated polymorphism.
         */

    }

}
