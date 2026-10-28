package optional_Class;

import java.util.Optional;

public class PdData {

	public static void readPdData(Product p) {
		
		String pdName = Optional.ofNullable(p)
						.map(Product::getPdname)
						.map(String::toString)
						.orElse("Invalid!!");
		
		System.out.println(pdName);
	}
	
	public static void main(String[] args) {
		
		Product p = new Product();
		Product p1 = new Product("Chair",101,200.00);
		
		readPdData(p1);
		readPdData(p);
	}
}
