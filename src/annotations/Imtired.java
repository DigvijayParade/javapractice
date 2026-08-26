package annotations;

public class Imtired {

	FInterface obj = (int a, int b) -> {System.out.println(a + b);};
	
	public static void main(String[] args) {
		
		Imtired demo = new Imtired();
		demo.obj.m1(20, 39);
	}
}
