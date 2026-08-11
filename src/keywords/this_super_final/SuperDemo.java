package keywords.this_super_final;

class Unsuper{
	
	String laugh ;
	public Unsuper(String laugh) {
		
		this.laugh = laugh ;
	}
	
	void m1() {System.out.println("Method 1 of paremt class");}
	void m2() {System.out.println("Method 2 of parent class");}
}

public class SuperDemo extends Unsuper{

	public SuperDemo (String laugh) {
		
		super(laugh);
	}
	
	public static void main(String[] args) {
		
	SuperDemo obj = new SuperDemo("No Laugh its super now");
	Unsuper obj1 = new Unsuper("This is just unsuper obj");
	obj.m1();
	obj.m2();
	
	}
	
	
	public void m1() {
		
//		System.out.println("Overrided m1 method from the parent class");
		
		super.m1();
	}
}
