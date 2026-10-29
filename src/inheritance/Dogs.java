package inheritance;

public class Dogs extends Animals{

	public static void main(String[] args) {
		
		Dogs d = new Dogs();
		d.makeNoise();
		d.eat();
	}
	
	@Override
	public void eat() {
		
		System.out.println("Dog eats");
	}
	@Override
	public void makeNoise() {
		
		System.out.println("Dog barks");
	}
}
