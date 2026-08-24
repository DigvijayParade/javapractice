package annotations;

public interface Demo {

	void m1();
	default int m2(int a,int b) {
		
		return a + b;
	}
	static void m3() {
		
		System.out.println("Interface Static method");
	}
}
