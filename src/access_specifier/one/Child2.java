package access_specifier.one;

public class Child2 {

	public static void main(String[] args) {
		
		System.out.println("same package , no need of inheritance,import");
	Parent2 pt = new Parent2();
	pt.meth1();
	pt.meth2();
	
	}
}
