package stream_api ;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mainsk{
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Laptop", Category.ELECTRONICS, 1200.00);
		Product p2 = new Product(2, "Headphones", Category.ELECTRONICS, 150.00);
		Product p3 = new Product(3, "Jeans", Category.FASHION, 45.00);
		Product p4 = new Product(4, "T-Shirt", Category.FASHION, 25.00);
		Product p5 = new Product(5, "Clean Code Book", Category.BOOKS, 40.00);
		Product p6 = new Product(6, "Smartwatch", Category.ELECTRONICS, 250.00);

		Order o1 = new Order(101, "Alice", List.of(p1, p3));
		Order o2 = new Order(102, "Bob", List.of(p2, p4, p5));
		Order o3 = new Order(103, "Charlie", List.of(p6));
		Order o4 = new Order(104, "David", null);      // Edge case: null products
		Order o5 = new Order(105, "Eve", List.of());    // Edge case: empty list

		List<Order> orders = List.of(o1, o2, o3, o4, o5);
		
		double avgEle = orders.stream()
									.filter(o -> o != null && o.getProducts() != null)
									.flatMap(o -> o.getProducts().stream())
									.filter(p -> p.getCa() ==  Category.ELECTRONICS)
									.mapToDouble(p -> p.getPrice())
									.average()
									.orElse(0.0);
		
		System.out.println(avgEle);
							
		Product maxPrice =	orders.stream()
			.filter(o -> o != null && o.getProducts() != null)
			.flatMap(o -> o.getProducts().stream())
			.max(Comparator.comparing(Product::getPrice))
			.get();
		
		System.out.println(maxPrice);
		
	Map <Category ,List<Product>> some =	orders.stream()
		.filter(o -> o != null && o.getProducts() != null)
		.flatMap(o -> o.getProducts().stream())
		.collect(Collectors.groupingBy(p -> ((Product) p).getCa()));
		 
						
					System.out.println(some);
					
					
				Map<Integer ,String> someL =	orders.stream()
					.filter(o -> o != null && o.getProducts() != null)
					.collect(Collectors.toMap(o -> o.getOrderId(), o -> o.getCustomerName()));
				
				System.out.println(someL);
	}
}