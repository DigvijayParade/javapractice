package inheritance;

interface Something{
	
	void some();//abstract method
}
interface What{
	int a = 0;
	public default void yes (){
		
		System.out.println("this is a default method in the interface ,we can override it");
	}
	
	void how();
}

public class Multiple implements Something,What{

	public static void main(String[] args) {
		
		Multiple obj =  new Multiple();
		
		System.out.println(a);
		obj. some();
		obj. yes();
		obj. how();
	}
	@Override
	public void some() {
		
		System.out.println("Method overriding");
		
	}
	@Override
	public void yes() {
		
		System.out.println("yes");
	}
	@Override
	public void how() {
		
		System.out.println ("idk how");
	}
}
