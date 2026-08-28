package exception_handling;

public class MultiCatch {

	public static void main(String[] args) {
		
try {
			
			String name = "Digvijay Parade";
			
			System.out.println(name.charAt(9));
			
			int a = 10 ;
			int b = 0 ;
			
			System.out.println(a / b);
			
		}

catch(StringIndexOutOfBoundsException e) {
	
	System.out.println("JVm will come here if there is a error happens at printing the char");
	System.out.println(e.getMessage());
}
catch(ArithmeticException e) {
	
	System.out.println("JVM will come here if the arithematic exception occurs");
	System.out.println(e.getMessage());
}
	}
}
