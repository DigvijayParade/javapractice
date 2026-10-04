package lambdas;

public class TheClass {

	public static void main(String[] args) {
		
		FiInter into = (x,y) ->{( x*x) + (y*y) };
		
		System.out.println(into.multi(10, 20));
	}
}
