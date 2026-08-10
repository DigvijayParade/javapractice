package keywords.this_super_final;

class Play{
	
	final int money = 50 ;
	public final String getname(String name) {
		
		return name ;
	}
}

final class This{
	
	public static void main(String[] args) {
		
		System.out.println("this class cant be extended");
	}
}

public class Finalkey extends Play{

	public static void main(String[] args) {
		
		System.out.println("cant extend the class this");
		Finalkey obj = new Finalkey();
		System.out.println("cant override the method getname");
		obj.getname("nanu");
		System.out.println(obj.money+" "+"cant change its value");
	}
	
}
