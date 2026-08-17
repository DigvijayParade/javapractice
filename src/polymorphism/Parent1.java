package polymorphism ;


class Parent{
	
	void m1() {
		
		System.out.println("Parents Method");
	}
	
}

class Child extends Parent{
	
	
	@Override
	public void m1() {
		
		System.out.println("Executing parents logic first than childs logic");
		
		super.m1();
		System.out.println("Overrided parents method");
	}
	
	void m2() {
		
		System.out.println("Cant call this method with the parent reference type cause it doesnt exist in the parent class");
	}
}

public class Parent1{
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		//this will execute the parents method
		p1.m1();
		
		//upcasting (Runtime polymorphism)
		Parent p2 = new Child();
		// this will call the pchilds method
		p2.m1();
		//down cating
		((Child)p2).m2();
		
		//downcasting
		System.out.println("///////////");
		p2.m1();
		
		Child obj = new Child();
		obj.m2();
		
	}
}