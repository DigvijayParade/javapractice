package cyber_success.methods;

public class EvenOdd {

	
	public static void check(int a) {
		
		if(a != 0 && a % 2 == 0) {
			
			System.out.println(a+" is a even number");
		}
		else if(a % 2 != 0) {
			
			System.out.println(a+" is a ood number");
		}
		else if(a == 0){
			
			System.out.println("Value of a 0");
		}
		
	}
	public static void main(String[] args) {
		
		check(0);
	}
}
