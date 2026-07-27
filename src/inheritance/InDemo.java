package inheritance;

class Main{

	void what() {
		
		int a;
		System.out.println("this is a Main class method");
	}
	
}class Demo{
	
	void how() {
		
		System.out.println("this is a Demo class method");
	}
	
}
public class InDemo {
	
	public static void main(String[] args) {
			
			here(new Main());
		}
	public static void here(Main meth) {
		
		meth.what();
		
	}
	}

