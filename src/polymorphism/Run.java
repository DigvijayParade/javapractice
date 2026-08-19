package polymorphism ;

class Compile{
	
	String name ;
	int id ;
	String workname ;
	public Compile(String name ,int id,String workname) {
		
		this(workname);//constchainig
		this.name = name ;
		this.id = id ;
	}
	//this compiletime in the context of the constructor overloading
	public Compile(String workname ) {
		
		this.workname = workname ;
		
	}
	
	void m1() {
		
		System.out.println("lets see thee method overlading also called the runtime polymorphism");
		
	}
	
	void m1(String some) {
		
		System.out.println("hello "+some);
	}	
}

interface what{
	
	default void meth1() {
		
		System.out.println("this is interface default method it doesnt matter if we override it or not in the child class");
	}
	
	void meth2();//this is a abstract method we have to implement in the child class
}

public class Run extends Compile implements what{
	
	public Run(String name,int id,String workname) {
		
		
		super(name,id,workname);
	}
	
	@Override
	public void m1() {
		
		System.out.println("this is runtime polymorphism");
		super.m1();//this is calling the parent class method
	}
	
	
	@Override
	public void m1(String some) {
		
		System.out.println("this is also overriding is runtime polymorphism");
		super.m1(some);//this is calling parents method
	}
	
	@Override
	public void meth1() {
		
		System.out.println("we calling the method of the parent class no shit gfan ");
		what.super.meth1();
	}
	@Override
	public void meth2() {
		
		System.out.println("well there u have it");

	}
	
	public static void main(String[] args) {
		
		Run obj = new Run("Digvijay",38,"Nanu");
		
		obj.m1();
		obj.m1("Doreamon");
		obj.meth2();
		obj.meth1();
	}
}