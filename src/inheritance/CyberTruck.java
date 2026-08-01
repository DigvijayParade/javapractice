package inheritance;

import java.util.*;

//
class Vehicle{
	
	String brand;
	int speed;
	
	public Vehicle(String brand, int speed) {
		
		this.brand = brand ;
		this.speed = speed ;
	}
	
	void drive(){
		
		System.out.println(brand+" "+"is driving at "+" "+speed+" "+"Km/h");
	}
}

interface Electric{
	
	void chargebattery();
	
	default void systemCheck() {
	
	System.out.println("Checking battery health and voltage..");
	
	}
}

interface selfDriving{
	
	void autoPark();
	
	default void systemCheck() {
		
		System.out.println("Checking battery health and voltage..");
		
		}
	
}

public class CyberTruck extends Vehicle implements Electric , selfDriving{
	
	public  CyberTruck(String brand, int speed){
		 
		 super(brand,speed);
	 }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brande Name :");
		String nameof = sc.nextLine();
		System.out.println("Enter the Speed :");
		int sp = sc.nextInt();
		
		CyberTruck c1 = new CyberTruck(nameof , sp);
		
		c1.drive();
		c1.chargebattery();
		c1.autoPark();
		c1.systemCheck();
	}
	
	@Override
	public void chargebattery(){
		
		System.out.println("checking"+" "+brand+" "+"battery");
	}
	
	@Override
	public void autoPark() {
		
		System.out.println(brand+" "+"autoparked itself");
	}
	
	@Override
	public void systemCheck() {
		
		selfDriving.super.systemCheck();
	}
	
}