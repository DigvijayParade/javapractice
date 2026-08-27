package exception_handling;

//import java.rmi.AlreadyBoundException;

public class Handle {
	
	public static void main(String[] args) {
		
		int a= 100 ;
		int b= 0 ;
		
		int [] arr = {100,200,300};
		try {
		System.out.println((a / b));
		System.out.println(arr[4]);	
		}
		catch(Exception e) {
			
			System.out.println("Something wrnog");
		}
		
		String name = "Sonu Monu";
		
		try {
		System.out.println(name.charAt(5));
		}
		catch(Exception e){
			
			System.out.println("Well what can i say");
		}
		
	}
}
