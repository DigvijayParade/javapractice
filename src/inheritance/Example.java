package inheritance;

import java.util.*;

class Add{
	
	
	void add() {
		
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		
	}
}
public class Example extends Add{

	public static void main(String[] args) {
		
		Add obj1 = new Add();
		Example obj = new Example();
		obj1.add();
		obj.add();
}
	@Override
	void add() {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b);
		
	}
}
