package annotations;

public class Imtired {
		
	public static void main(String[] args) {
		

		FInterface obj = (int a, int b) -> {System.out.println(a + b);};
		FInterface obj1 = (int a, int b) -> {System.out.println(a * b);};
		Imtired demo = new Imtired();
		demo.dLuffy(obj);
		demo.dLuffy(obj1);
		
		
	}
	
	void dLuffy(FInterface object) {
		
		object.m1(10, 40);
	}
}
