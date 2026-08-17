package access_specifier.two;

import access_specifier.one.*;

public class Child2 extends Parent2{

	public static void main(String[] args) {
		
		System.out.println("can create the object without the extending");
	Parent2 obj = new Parent2();
	
	obj.meth2();//can access the public method through the parent object 
	
	//but to access protected we need importing inheritance and its own class object
	
	Child2 obj1 = new Child2();
	obj1.meth1();//can be accessed through the child object
	}
	
}
