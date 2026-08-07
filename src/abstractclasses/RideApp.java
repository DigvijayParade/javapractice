package abstractclasses;

public class RideApp {

	public static void main(String[] args) {
		
		Driveable car1 = new GasCar("Alex", "GAS-999");
        car1.startengine();
        car1.navigate("Downtown");
        car1.stopengine();

        Driveable car2 = new Tesla("Sarah", "EV-100", 85);
        car2.startengine();
        car2.navigate("Airport");
        car2.stopengine();
	}
}
