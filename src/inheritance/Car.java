package inheritance;

import java.util.*;

class Speed {

    String model;
    String color;

    public Speed(String model, String color) {
       
        this.model = model;
        this.color = color;
    }

    void speed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance km :");
        double distance = sc.nextDouble();

        System.out.println("Enter time hours :");
        double time = sc.nextDouble();

        if (time > 0) {
            double calculatedSpeed = distance / time;
            System.out.println(color + " " + model + " is going at the speed of " + calculatedSpeed + " km/h");
        } else {
            System.out.println("Time must be greater than 0");
        }
    }
}

interface Drivable {
    void startEngine();
    void accelerate();
    void applyBrake();
}

class Car extends Speed implements Drivable {

    public Car(String model, String color) {
        super(model, color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter model name : ");
        String inputmodel = sc.nextLine();

        System.out.println("Enter color : ");
        String inputcolor = sc.nextLine();

        Car c1 = new Car(inputmodel, inputcolor);
        
        c1.speed();
        c1.startEngine();
        c1.accelerate();
        c1.applyBrake();
    }

    @Override
    public void startEngine() {
        System.out.println("The " + color + " " + model + " engine has started.");
    }

    @Override
    public void accelerate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Accelerating ---");
        System.out.println("Enter time (hours): ");
        double timehr = sc.nextDouble();

        System.out.println("Enter distance (km): ");
        double distance = sc.nextDouble();

        double speed = distance / timehr;
        System.out.println(color + " " + model + " accelerated to " + speed + " km/h");
    }

    @Override
    public void applyBrake() {
        System.out.println("Pressed brake to slow down the " + color + " " + model + ".");
    }
}