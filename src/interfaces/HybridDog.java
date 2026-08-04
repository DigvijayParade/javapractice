package interfaces;

import java.util.ArrayList;

interface Properties{
	
	void sharpTeeth();
	void bigBody();
}


///////
class Dog implements Properties{
	
	@Override
	public void sharpTeeth() {
		
		System.out.println("Dog has a sharp teeth");
	}
	
	@Override
	public void bigBody() {
		
		System.out.println("dog dosnt have big body compared to wolves");
	}
}


///////
class Wolf implements Properties {
	
	@Override
	public void sharpTeeth() {
		
		System.out.println("Wolf has a sharper teeth");
	}
	
	@Override
	public void bigBody() {
		
		System.out.println("wolves are huge mate");
	}
}

public class HybridDog {

	public static void main(String[] args) {
		
		
		ArrayList <Properties> hybrid = new ArrayList <>();
		
		Properties an1 = new Dog();
		Properties an2 = new Wolf();
		
		hybrid.add(new Dog());
		hybrid.add(an1);
		hybrid.add(an2);
		
		for(Properties h : hybrid) {
			
			h.bigBody();
			h.sharpTeeth();
		}
	}
}
