package exception_handling;

public class RuntimeDemo {

	public static void main(String[] args) {
		
	int a = 10 ;
	int b = 0;
	
	try {
	System.out.println((a /b ));
	}
	catch(Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	}
	
}
