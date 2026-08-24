package annotations;

public class AnnotationDemo implements Demo{

	@Override
	public void m1() {
		
		System.out.println("Using the @Override annotation.....");
		
	}
	
	@Override
	public int m2(int a, int b) {
		
		System.out.println(Demo.super.m2(10, 20));//calling the interfaces og meth
		return a + b ;
		
	}
	
	public static void main(String[] args) {
		
		AnnotationDemo obj = new AnnotationDemo();
		obj.m1();
		System.out.println(obj.m2(78, 85));
	}
}
