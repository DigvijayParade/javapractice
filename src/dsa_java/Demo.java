package dsa_java ;

public class Demo{
	
	public static void main(String[] args) {
		
		primeOrComp(11);
		
	}
	
	public static void primeOrComp(int num) {
		
		if(num <= 1) {
			
			System.out.println("Invalid Input !!");
			return ;
		}
		
		for(int i = 2 ; i <= Math.sqrt(num); i++) {
			
			if(num % i == 0) {
				
				System.out.println(num + " is aComposite Number !!");
				return ;
			}
		}
		
		System.out.println(num+" is a Preim Number !!");
		
	}
}