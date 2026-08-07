package abstractclasses;

public class Tesla extends ElectricVehicle {

	public Tesla(String drivername, String licenseplate , int batterylevel) {
		super(drivername, licenseplate, batterylevel);
		
	}

	@Override
	public void startengine() {
		
		System.out.println("The Tesla is started...");
		
	}

	@Override
	public void navigate(String destany) {
		
		System.out.println("Driver Name is "+drivername);
		System.out.println("License Plate Number is : "+licenseplate);
		System.out.println("Tesla is going to "+destany);
		
	}

	@Override
	public void stopengine() {
		
		System.out.println("The tesla is Stopped");
		
	}


}

