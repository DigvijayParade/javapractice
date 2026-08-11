package keywords.this_super_final;

public class UsingThis {

	//1st case while doing the method shadowing
	String name ;
	int id ;
	double percentage ;
	public UsingThis(String name , int id) {
		
		//this does the const chainig
		this(75.00);
		this.name = name ;
		this.id = id ;
	}
	
	public UsingThis(double percentage) {
		
		this.percentage = percentage ;
	}
	
	UsingThis m1() {
		
		System.out.println("Using the method chainig");
		//method chainig
		return this ;
	}
	
	UsingThis m2() {
		
		System.out.println("using the the method chainig for the 2nd method");
		
		this.m3();
		return this ;
		
	}
	
	void m3() {
		
		System.out.println("method calling using this ");
	}
	
	
}
