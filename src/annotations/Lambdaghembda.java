package annotations;

public class Lambdaghembda {
	
	public static void main(String[] args) {
		
		FInterface add = (int a , int b) -> System.out.println(a + b);
		FInterface multi = (int a , int b) -> System.out.println(a * b);
		
		Lambdaghembda obj = new Lambdaghembda();
		obj.calc(multi);
		obj.calc(add);
	}
	
	void calc(FInterface e) {
		
		e.m1(78, 0);
	}

}
