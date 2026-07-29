package inheritance;

import java.util.*;

class Parent{
	
	String name;
	public Parent(String name) {
		
		this.name = name;
	}
	void parent() {
		
		System.out.println("we will just use it as it is");
		
	}
	void parent2() {
		
		System.out.println("We will override this one");
	}
}
public class SimpleInhar extends Parent {
	
	int id ;
	public SimpleInhar (int id,String name){
		
		super(name);
		this.id = id;
		
		
	}
	public static void main(String[] args) {
		
		SimpleInhar obj = new SimpleInhar(29,"nanu");
		obj.parent();
		obj.parent2();
	}
	@Override
	void parent2() {
		
		System.out.println(id);
		System.out.println(name);
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
