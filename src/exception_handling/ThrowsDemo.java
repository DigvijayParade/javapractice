package exception_handling;

public class ThrowsDemo {

	void calc(int a,int b,String op) throws Exception{
		
		switch(op) {
		
		case "Add" :
			System.out.println(a + b);
			break;
			
		case "Minus" :
			System.out.println(a - b);
			break ;
			
		case "Multi" :
			System.out.println(a * b);
			break;
			
		case "Divide" :
			System.out.println(a / b);
			break;
			
		default :
			System.out.println("Type shit ,aint nothing in it to work on");
		}
	}
	public static void main(String[] args) {
		
		ThrowsDemo calcy = new ThrowsDemo();
		try {
		calcy.calc(10, 0, "Divide");
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
