package inheritance;

class Air{
	
	public static void goes() {
		
		System.out.println("normal method of the Air class");
	}
	public void gas() {}
}
public class Inhale extends Air{

	public static void main(String[] args) {
		
	}
	public static void goes() {
		
		System.out.println("overrided method");
		
	}
	
	@Override
	public void gas() {
		
		System.out.println("dont inhale gas");
	}
}
