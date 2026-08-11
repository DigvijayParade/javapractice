package keywords.this_super_final;

class Unsuper{
	
	String laugh ;
	public Unsuper(String laugh) {
		
		this.laugh = laugh ;
	}
	
	void m10() {System.out.println("Method 1 of paremt class");}
	void m2() {System.out.println("Method 2 of parent class");}
}

interface SuperDuper{
	
	//well whats the point of variable cause they are always final no matter from where we access interface vars :)
	default void m3() {
		
		System.out.println("Interface method");
	}
}

public class SuperDemo extends Unsuper implements SuperDuper{

	String laugh ;
	public SuperDemo(String childLaugh, String parentLaugh) {
        super(parentLaugh);        
        this.laugh = childLaugh;  
    }
	
	public static void main(String[] args) {
		
	SuperDemo obj = new SuperDemo("No Laugh its super now", "laugh its unsuper");
	Unsuper obj1 = new Unsuper("This is just unsuper obj");
	obj.m10();
	obj.m2();
	obj.m3();
	
	}
	
	
	public void m10() {
		
		System.out.println("1st using the overrided method logic than the parent class logic ");
		System.out.println("parents laugh ,"+this.laugh);
		System.out.println("childs laugh ,"+super.laugh);
		super.m10();
	}
	
	@Override
	public void m3() {
		
		System.out.println("Overriden interface method");
		System.out.println("Now for the original method");
		SuperDuper.super.m3();
	}
}
