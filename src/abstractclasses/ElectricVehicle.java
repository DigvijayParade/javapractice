package abstractclasses;

public  abstract class ElectricVehicle extends Vehicle{

	int batterylevel ;
	public ElectricVehicle(String drivername, String licenseplate , int batterylevel) {
		
		super(drivername, licenseplate);
		this.batterylevel = batterylevel ;
		
		System.out.println("Drive name :"+" "+drivername);
		System.out.println("Licence Plate : "+" "+licenseplate);
		System.out.println("Battery Level : "+" "+batterylevel);
		
	}
	@Override
	public void startengine() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void navigate(String destany) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stopengine() {
		// TODO Auto-generated method stub
		
	}

	
}
