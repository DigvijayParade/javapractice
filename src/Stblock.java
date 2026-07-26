import java.util.*;
public class Stblock {

	String name;
	int a;
	int b;
	
	public Stblock(String name) {
		
		this.name = name;
		
	}
	public Stblock(int a,int b) {
		
		this.a = a;
		this.b = b;
		
	}
	static  {
		
		System.out.println("This is a static block only executes when the"
				+ " class is loaded/created");
		
		Stblock obj = new Stblock("Nanu");
		obj.meth2();
		Stblock obj1 = new Stblock(10,10);
		obj1.meth1();
		
//		System.out.println(Arrays.toString(args));
		
	}
	public static void main(String[] args) {
		
	}
	
	public void meth1() {
		
		System.out.println(a + b);
	}
	public void meth2() {
		
		System.out.println("non -static method");
	}
}
