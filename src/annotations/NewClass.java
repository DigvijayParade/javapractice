package annotations;

public class NewClass {

	public static void main(String[] args) {
		
	Some obj = (int a, int b) -> {return a + b;};
	
	int result =  obj.meth(20,30);
	System.out.println(result);
	
//	DiffMeths obj1 = (String h) -> {System.out.println();};
	}
}
