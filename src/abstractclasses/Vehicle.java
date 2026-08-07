package abstractclasses;

public abstract class Vehicle implements Driveable{

	String drivername ;
	String licenseplate ;
	
	public Vehicle (String drivername , String licenseplate) {
		
		this. drivername = drivername ;
		this. licenseplate = licenseplate ;
		
		System.out.println("Drive name :"+" "+drivername);
		System.out.println("Licence Plate : "+" "+licenseplate);
	}
}
