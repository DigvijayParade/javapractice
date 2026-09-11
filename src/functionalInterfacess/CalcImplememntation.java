package functionalInterfacess;

public class CalcImplememntation {

	public static void main(String[] args) {
		
		LambdaDemo c1 = (a , b) ->{ System.out.println("add");  return a +b ;};
//		LambdaDemo c2 = (a , b) -> System.out.println(a - b);
//		LambdaDemo c3 = (a , b) -> System.out.println(a / b);
//		LambdaDemo c4 = (a , b) -> System.out.println(a * b);
//		LambdaDemo c5 = (a , b) -> System.out.println(a % b);
		
		System.out.println(c1.calc(10, 23));
//		c2.calc(10, 23);
//		c3.calc(10, 23);
//		c4.calc(10, 23);
//		c5.calc(10, 23);
		
		
	}
}
