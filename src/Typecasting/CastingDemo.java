package Typecasting;

public class CastingDemo {

	public static void main(String[] args) {
		
		int a = 10 ;
		long b = a ;
		
		System.out.println("Implicit type casting "+b);
		
		long p = 1000000000000000000l;
		System.out.println(p);
		int y = (int)p ;
		System.out.println(y);
	}
}
