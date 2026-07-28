package inheritance;

import java.util.*;

class Parent{
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		obj .parent();
		obj.parent2();
	}
	void parent() {
		
		System.out.println("we will just use it as it is");
		
	}
	void parent2() {
		
		System.out.println("We will override this one");
	}
}
class SimpleInhar extends Parent {
	
	public static void main(String[] args) {
		
		SimpleInhar obj = new SimpleInhar ();
		obj.parent();
		obj.parent2();
	}
	
	@Override
	void parent2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("overrided method");
		System.out.println("just enter opr name & some numbers");
		String ope = sc.nextLine();
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		switch(ope) {
		
		case "add" : System.out.println(a + b);
					break;
		
		case "minus" : System.out.println(a - b);
					break;
					
		
		case "multi" : System.out.println(a * b);
					break;
		
		case "divide" : System.out.println(a / b);
					break;
		
		case "reminder" : System.out.println(a % b);
					break;
		
		default : System.out.println("invalid input");
					break;
		}
		
	}

}
public class Multilevel extends SimpleInhar{
	
	String msg;
	
	public Multilevel(Scanner sc){
		System.out.print("Enter a message for this object: ");
		this.msg = sc.nextLine();
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Multilevel obj = new Multilevel(sc);
		
		obj.parent();  
        obj.parent2();
	}
	
	@Override
	void parent2() {
		
		System.out.println(msg);
	}
}