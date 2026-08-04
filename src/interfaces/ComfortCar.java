package interfaces;

public interface ComfortCar extends BaseVehicle{

	default void comfort(int chose) {
		
		if(chose == 1) {
			
			System.out.println("control the car AC");
		}
		else if(chose == 2) {
			
			System.out.println("Turn on music");
		}
		else if(chose == 3) {
			
			System.out.println("cruise control");
		}
	}
}
