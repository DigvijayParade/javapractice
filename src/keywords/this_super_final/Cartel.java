package keywords.this_super_final;

abstract class Vehicle {

	String brand;
	double dailyRate;
	final int MAX_RENTAL_DAYS = 30;
	static double totalFleetRevenue;

	public Vehicle(String brand, double dailyRate) {
		this.brand = brand;
		this.dailyRate = dailyRate;
	}

	public Vehicle(String brand) {
		this(brand, 50.0);
	}

	abstract double calculateCost(int days);

	static void displayFleetStats() {
		System.out.println("Total Fleet Revenue: " + totalFleetRevenue);
	}

	Vehicle applyPromoDiscount(double discountPercentage) {
		this.dailyRate -= this.dailyRate * (discountPercentage / 100.0);
		return this;
	}
}

class Car extends Vehicle {

	boolean hasGPS;

	public Car(String brand, double dailyRate, boolean hasGPS) {
		super(brand, dailyRate);
		this.hasGPS = hasGPS;
	}

	@Override
	double calculateCost(int days) {
		if (days > MAX_RENTAL_DAYS) {
			days = MAX_RENTAL_DAYS;
		}

		double total = dailyRate * days;
		if (hasGPS) {
			total += 10 * days;
		}

		totalFleetRevenue += total;
		return total;
	}
}

class Truck extends Vehicle {

	double payloadTons;

	public Truck(String brand, double dailyRate, double payloadTons) {
		super(brand, dailyRate);
		this.payloadTons = payloadTons;
	}

	@Override
	double calculateCost(int days) {
		if (days > MAX_RENTAL_DAYS) {
			days = MAX_RENTAL_DAYS;
		}

		double total = (dailyRate * days) + (payloadTons * 50);
		totalFleetRevenue += total;
		return total;
	}
}

public class Cartel {

	public static void main(String[] args) {

		Car tesla = new Car("Tesla", 100, true);
		double carCost = tesla.applyPromoDiscount(10).calculateCost(5);
		System.out.println("Car Rental Cost: " + carCost);

		Truck ford = new Truck("Ford", 150, 2.5);
		double truckCost = ford.calculateCost(3);
		System.out.println("Truck Rental Cost: " + truckCost);

		Vehicle.displayFleetStats();
	}
}