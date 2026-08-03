package inheritance;

import java.util.ArrayList;

interface Driveable {
    void startEngine();
    void drive();
}


class Vehicl implements Driveable {
    String brand;

    public Vehicl(String brand) {
        this.brand = brand;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " engine started standard ignition.");
    }

    @Override
    public void drive() {
        System.out.println(brand + " is cruising normally.");
    }
}

class CyberTruc extends Vehicl {
    public CyberTruc(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println(brand + " is driving silent in Silent Electric Mode!");
    }
}

class SportsCar extends Vehicl {
    public SportsCar(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println(brand + " is screaming down the highway at 200 mph!");
    }
}

public class Maina {
    public static void main(String[] args) {

        Driveable myTruck = new CyberTruc("Tesla CyberTruck");
        Driveable myFerrari = new SportsCar("Ferrari F8");

        ArrayList<Driveable> garage = new ArrayList<>();
        garage.add(myTruck);
        garage.add(myFerrari);

        System.out.println("=== GARAGE STARTUP ===");

        for (Driveable item : garage) {
            item.startEngine();
            item.drive();
            System.out.println("-----------------------------------");
        }
    }
}