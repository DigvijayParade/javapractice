package Interface;

interface Hi{
	
	public static final int maxSpped = 160;
	
	//abstract method
	public void hi(String msg);
	
	//default method
	default void what(String h) {
		
		System.out.println(h);
		how(10);
	}
	
	//default method 2
	default void now() {
		
		System.out.println("this 2nd def meths only role is to show hoe the private meth can be used in other class");
	}
	
	// static method
	public static void when(int a) {
		
		System.out.println(a);
		
	}
	
	private void how(int a) {
		
		System.out.println(a);
	}
}

public class Hello implements Hi{

	public static void main(String[] args) {
		
		Hello obj = new Hello();
		obj.hi("this is a abstract method notice how i changed var name but cant change hte data type");
		obj.what("this is a overrided def method");
		obj.now();
		when(2);
		
	}
	//que : can abstract ethod be overloaded if i remove annotation
	@Override 
	public void hi(String message) {
		
		System.out.println(message);
	}
	
	
	//
	//question : if i remove the annotation n changed the parametes from string to int will it be overoading or totaly new mwthod from the child class itself
	@Override
	public void what(String h) {
		
		System.out.println(h);
		
	}
	
	public static void when(int a) {
		
		System.out.println(a+" "+"this is basically method shadowing cause its an static meth");
		
	}
}
