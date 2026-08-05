package inheritance;

public class Veh{
    private String brandName;
    protected int currentSpeed;

    public Veh(String brandName){
        this.brandName = brandName;
        this.currentSpeed = 0;
        System.out.println("neww vehile registered: " + brandName);
    }

    public String getBrandName() {
        return brandName;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void accelerate(){
        currentSpeed += 10;
        System.out.println("accelerating speed is now " + currentSpeed + " km/h");
    }

    public static void main(String[] args) {

        SportCar ferrari = new SportCar("ferrari");
        ferrari.accelerate();
        ferrari.useNitro(50);
        ferrari.useNitro(30);

        System.out.println();

        HeavyTruck truck = new HeavyTruck("TATA", 15);
        truck.accelerate();

        System.out.println("racee finished between " + ferrari.getBrandName() + " and " + truck.getBrandName());
    }
}


class SportCar extends Veh {
    boolean nitroReady = true;

    public SportCar(String brandName) {
        super(brandName);
    }

    @Override
    public void accelerate() {
        currentSpeed += 20;
        System.out.println(" sports car speeding Speed is now " + currentSpeed + " km/h");
    }

    public void useNitro(int boostAmount){
        if(nitroReady == true){
            currentSpeed += boostAmount;
            System.out.println("mitro boost Speed is now " + currentSpeed);
            nitroReady = false;
        }else {
            System.out.println("nitro is recharging Cant boost.");
        }
    }
}


class HeavyTruck extends Veh {
    int loadWeight;

    public HeavyTruck(String brandName, int loadWeight) {
        super(brandName);
        this.loadWeight = loadWeight;
    }

    @Override
    public void accelerate(){
        currentSpeed += 5;
        System.out.println("truck speeding with " + loadWeight + " Speed is now " + currentSpeed + " km/h");
    }
}