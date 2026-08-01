package inheritance;

import java.util.*;

interface Spider{

	default void stmt() {
		
		System.out.println("This is the spider that is mf");
	}
	void webs();
	void legs8();
	
}

class Human{
	
	String huName;
	int huAge;
	public Human(String huName, int huAge) {
		
		this.huAge = huAge;
		this.huName = huName;
	}
	
	void bitten() {
		
		System.out.println("Spider bit the"+" "+huName+" "+"hes just "+huAge+"old");
	}
	
	void speaks() {
		
		System.out.println("this nigga can speak");
	}
}

public class SpiderMan extends Human implements Spider{

	public SpiderMan(String huName, int huAge) {
		
		 super(huName , huAge);
		
	}
	
	@Override
	public void webs() {
		
		System.out.println("this nigga"+huName+"got webs n shit");
	}
	@Override
	public void legs8() {
		
		System.out.println("this nigga"+huName+"got none of them 8 legs, he jsut "+huAge+"years old");
	}
	@Override
	public void speaks() {
		
		System.out.println("this nigga now A SpiderMan");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Name Nigga : ");
		String name = sc.nextLine();
		System.out.println("Enter ur age cuh : ");
		int age = sc.nextInt();
		
		SpiderMan g1 = new SpiderMan(name,age);
		g1.stmt();
		g1.bitten();
		g1.webs();
		g1.legs8();
		g1.speaks();
		
	}
	
}
