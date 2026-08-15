package constructor;

public class ConstOverload {

	String name ;
	
	public ConstOverload( int age) {
		
		this(5500.00);
		System.out.println("Default const");
		
	}

	public ConstOverload(String name ) {
		
		System.out.println("Overloaded const 2");
		this.name = name ;
		System.out.println(this.name);
		
	}
	
	public ConstOverload(double h ) {
		
		System.out.println("overloaded const 3");
		
	}
	
	public static void main(String[] args) {
		
		ConstOverload obj = new ConstOverload(45);
		
		obj.m1().m2().m3();
		
	}
	
	public ConstOverload m1() {
		
		System.out.println("Chained meth 1");
		return this ;
	}
	
	public ConstOverload m2() {
		
		System.out.println("Chained meth 2");
		return this ;
	}
	
	public void m3() {
		
		System.out.println("Chained meth 3");
		
	}
	
}
