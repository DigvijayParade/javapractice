package inheritance;

import java.util.*;

class Parat{
	
	String name;
	public Parat(String name) {
		
		this.name = name;
	}
	void parent() {
		
		System.out.println("we will just use it as it is");
		
	}
	void parent2() {
		
		System.out.println("We will override this one");
	}
}
public class SimpleInhart extends Parat {
	
	int id ;
	public SimpleInhart (int id,String name){
		
		super(name);
		this.id = id;
		
		
	}
	public static void main(String[] args) {
		
		SimpleInhart obj = new SimpleInhart(29,"nanu");
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
