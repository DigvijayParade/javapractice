package abstractclasses;

public class GasCar extends Vehicle{

	public GasCar(String drivername, String licenseplate) {
		super(drivername, licenseplate);
		
		System.out.println("Drive name :"+" "+drivername);
		System.out.println("Licence Plate : "+" "+licenseplate);
	}

	@Override
	public void startengine() {
		
		System.out.println("The Gas Car is started...");
		
	}

	@Override
	public void navigate(String destany) {
		
		System.out.println("Driver Name is "+drivername);
		System.out.println("License Plate Number is : "+licenseplate);
		System.out.println("Gas Car is going to "+destany);
		
	}

	@Override
	public void stopengine() {
		
		System.out.println("The Gas Car is Stopped");
		
	}

}
