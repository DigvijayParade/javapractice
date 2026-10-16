package lambdas;

public class PracticeMaker {

	public static void main(String[] args) {
		
		Practice p1 = (a , b) -> System.out.println(a+b);
		
		p1.meth(10, 20);
	}
}
