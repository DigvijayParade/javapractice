package functionalInterfacess;

@FunctionalInterface
public interface EmpOp {

	String apply (Employee emp);
	
	static void m1() {System.out.println("this is the static method");
	
		m2();
	
	};
	
	private static void m2() {
		
		System.out.println("We can call this private meth into the another methods of the interfae");
	};
}
