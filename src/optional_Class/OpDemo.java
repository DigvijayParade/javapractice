package optional_Class;

public class OpDemo {

	public static void meth(String n) {
		
		
	}
	
	public static void main(String[] args) {
		
		Data d1 = new Data("Nanu",101);
		Data d2 = new Data();
		
		meth(d1.getName());
		meth(d2.getName());
		
	}
}
