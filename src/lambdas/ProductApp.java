package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class ProductApp {

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Wireless Mouse", 25.50, "Electronics", true);
		Product p2 = new Product(102, "Gaming Laptop", 1200.00, "Electronics", true);
		Product p3 = new Product(103, "Coffee Maker", 45.00, "Home", false);
		Product p4 = new Product(104, "Mechanical Keyboard", 85.00, "Electronics", false);
		Product p5 = new Product(105, "Ergonomic Desk Chair", 150.00, "Furniture", true);
		
		Predicate<Product> inStock = o -> o.isInStock() ;
		
		Function<Product ,String> details = o -> {return "Name : "+o.getName()+"||"+o.getId()
		+"||"+o.getPrice()+"||"+o.getCategory();};
		
		Consumer<Product> restock = o -> System.out.println("Alert Restock: "+o.getName());
		
		Supplier<Product> give = () -> new Product(0, "Free Sample", 0.0, "Promo", true);
		
		
		ArrayList<Product> pdList = new ArrayList<>(List.of(p1,p2,p3,p4,p5));
		
		for(Product p : pdList) {
			
			if(inStock.test(p)) {
				
				System.out.println(p.getName());
			}
		}

		System.out.println("Another one //////////////////////////");
		for(Product p : pdList) {
				
//				System.out.println(p);
			
			String s = details.apply(p);
			System.out.println(s);
			}
		
		for(Product p : pdList) {
			
			if(inStock.test(p) != true) {
				
				restock.accept(p);
			}
		}
		
		Product promoProduct = give.get();

		System.out.println("Promo Item Created: " + promoProduct.getName());

		pdList.add(give.get());
		}
	
		
		
	}

