package method.overriding ;

import java.util.*;

interface Human{
	
	void eats();
	
	void sleeps();
}

abstract class All implements Human{
	
	String name ;
	int age ;
	public All(String name , int age ) {
		
		this.name = name ;
		this.age = age ;
	}
	
	//Overriding
	
	@Override 
	public void eats() {
		
		System.out.println(name+" "+"eats the food !!");
		System.out.println(name+"s"+" "+"age is"+" "+age);
	}
	
	@Override 
	public void sleeps() {
		
		System.out.println(name+" "+"Goes to sleep !!");
		
	}
	
}

class Male extends All{
	
	final String gender = "Male";
	
	public Male (String name , int age ) {
		
		super(name , age);
		
	}
}

class Female extends All{
	
	public Female(String name , int age ) {
		
		final String gender = "Female";
		
		super(name , age);
	}
}

public class DemoOverriding{
	
	public static void main(String[] args) {
		
		All m1 = new Male("Nanu",23);
		m1.eats();
		m1.sleeps();
		
		System.out.println("//////////////////");
		
		All f1 = new Female("Swara",23);
		f1.eats();
		f1.sleeps();
	}
}