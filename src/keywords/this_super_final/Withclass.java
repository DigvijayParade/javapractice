package keywords.this_super_final;

//this class cant be inherited
final class Mobile{
	
	String brand ;
	//final variable ,its just a blank final var right now but have to assighn value at some point 
	final double price ;
	
	public Mobile (String brand ,double price) {
		
		this.brand = brand ;
		this.price = price ;
	}
	
	//cant override this methos ps: aint no inheritance no point of inheritance
	final void buy() {
		
		System.out.println("Bought "+brand+" "+"Phone for "+price);
	}
	
	final void receipt(String csName) {
		
		System.out.println("Customer : "+csName);
		System.out.println("Brand : "+brand);
		System.out.println("The final price cant be changed Price in Rs : "+price);
		
	}
}

//public class Withclass extends Mobile{ this is gonna give error cant extend the final class
	
public class Withclass {

	public static void main(String[] args) {
		
		// but we can just use the class Mobile normally
		Mobile m1 = new Mobile("Iphone",100000.0);
		
//		m1.price = 78000.00 ; this will give error cant change the final value 
		
		m1.buy();
		m1.receipt("Jhon Wick");;
		
	}
}
