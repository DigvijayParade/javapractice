package inheritance;


interface one{
	
	default void meth0() {
		
		System.out.println("this is a interface ones method");
	}
}

interface Two{
	
	void meth();
	
	static void meth1() {
		
		System.out.println("This is a interface twos normal method");
	}
}
public class Inhe implements Two,one{

	public static void main(String[] args) {
		
		Inhe obj = new Inhe();
		obj.meth();
		Two.meth1();
		obj.meth0();
	}
	public void meth() {
		
		System.out.println("this is intefaces overriden abstract method");
	}
	
	public void meth0() {
		
		System.out.println("interface ones overriden method");
	}
}
