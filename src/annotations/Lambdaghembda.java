package annotations;

public class Lambdaghembda {
	
	public static void main(String[] args) {
		
		FInterface add = (int a , int b) -> System.out.println(a + b);
		FInterface multi = (int a , int b) -> System.out.println(a * b);
		
		Lambdaghembda obj = new Lambdaghembda();
		obj.calc(multi);
		obj.calc(add);
		
		Some obj1 = (int a, int b) -> {System.out.println("Doing something woith this nums");
									return a * b;};
		
		int result = obj1.meth(6, 7);
	}
	
	void calc(FInterface e) {
		
		e.m1(78, 0);
	}

}
