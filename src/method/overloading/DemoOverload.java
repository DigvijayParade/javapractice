package method.overloading;

import java.util.Scanner;

public class DemoOverload{
	
	String name ;
	int id ;
	double money ;
	boolean isRich ;
	
	public DemoOverload(String name , int id) {
		
		this.name = name ;
		this.id = id ;
		
	}
	
	//Constructor overloading 
	public DemoOverload (double money , boolean isRich) {
		
		this.money = money ;
		this.isRich = isRich ;
	}
	
	public void Student (String department , String subjects) {
		
		System.out.println(name+" "+"belongs to "+department+" "+"he has"+subjects);
	}
	
	//method overloading
	public void Student() {
		
		if(money > 100000) {
			
			isRich = true ;
			System.out.println(name+" "+"is rich af");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DemoOverload obj = new DemoOverload(sc.nextLine(),sc.nextInt());
		
		sc.nextLine();
		
		obj.Student("MCA","Java, Python, DSA");
		
		DemoOverload obj1 = new DemoOverload(sc.nextDouble(),sc.hasNextBoolean());
		
		obj1.Student();
	}
}