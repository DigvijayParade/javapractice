package interfaces;

public interface ElectricVehicle extends ComfortCar{

	void autopilot() ;
	@Override
	public default void checkFuel(int battery) {
		
		if(battery > 100){
			
			System.out.println("Battery boom , ERROR 404");
		}
		else if (battery >=60) {
			
			System.out.println("enough power");
		}
		else if(battery >= 30) {
			
			System.out.println("low battry !!");
		}
		else if (battery == 0) {
			
			System.out.println("Car Dead !!");
		}
	}
}
