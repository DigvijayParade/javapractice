package cyber_success.methods;

public class Factorial {

	public static void main(String[] args) {
		
		fact(5);
	}
	
	static void fact(int x) {
		
		int result = 1 ;
		for(int i = x ; i >= 1 ; i--) {
			
			result = result * i ;
		}
		System.out.println("Factorial of " + x + " is: " + result);
	}
}
