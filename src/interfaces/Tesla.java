package interfaces;

public class Tesla implements ElectricVehicle {

	@Override
	public void autopilot() {
		System.out.println("Autopilot mode ON, hands off the wheel");
	}

	public static void main(String[] args) {

		ElectricVehicle myCar = new Tesla();

		myCar.action("start");
		myCar.action("accerlate");
		myCar.comfort(1);
		myCar.comfort(2);
		myCar.checkFuel(80);
		myCar.autopilot();
		myCar.action("break");
	}
}