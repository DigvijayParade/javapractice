package keywords.this_super_final;

abstract class Gadi{
	
	String brand ;
	double dailyRate ;
	final int maxRentalDays = 30 ;
	static double totalFleetRevenue ;
	
	public Gadi(String brand ,double dailyRate ) {
		
		this.brand = brand ;
		this.dailyRate = dailyRate ;
	}
	
	public Gadi(String brand) {
		
		this(brand,50);
	}
	
	abstract double calculateCost(int days);
	
	static void displayFleetStats() {
		
		System.out.println("Total Fleet Revenue : "+totalFleetRevenue);
	}
	
	Gadi applyPromoDiscount(double discountPercentage) {
		
		this.dailyRate -= this.dailyRate*(discountPercentage/100.0);
		
		return this ;
	}
	
}

class Car extends Gadi{
	
	boolean hasGPS ;
	public Car(String brand ,double dailyRate ,boolean hasGPS) {
		
		super(brand ,dailyRate ) ;
		this.hasGPS = hasGPS ;
	}
	
	@Override
	public double calculateCost(int days) {
		
		
		return totalFleetRevenue;
	}
}

public class Cartel{}






