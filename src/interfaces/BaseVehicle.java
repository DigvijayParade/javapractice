package interfaces;

public interface BaseVehicle {

	default void action(String action) {
		
		switch( action ) {
		
		case "start" :
			System.out.println("car started");
			break;
			
		case "accerlate" :
			System.out.println("Car started accerlating");
			break;
			
		case "break" :
			System.out.println("Car stoped ");
			break;
			
		default :
			System.out.println("Enter valid input");
			break;
		}
	}
	void checkFuel(int fuellevel);
	
}
