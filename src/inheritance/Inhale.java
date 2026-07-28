package inheritance;

class Air{
	
	public static void goes() {
		
		System.out.println("normal method of the Air class");
	}
	 void gas() {}
}
public class Inhale extends Air{

	public static void main(String[] args) {
		
		goes();
		Inhale is = new Inhale();
		is.gas();
	}
	public static void goes() {
		
		System.out.println("overrided method");
		
	}
	
	@Override
	void gas() {
		
		System.out.println("dont inhale gas");
	}
}
