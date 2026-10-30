package stream_api;

import java.util.List;

public class InventoryApp {

	public static void main(String[] args) {
		
		List<Product> pd = List.of(
				new Product("Laptop", "Electronics", 1200.00, true),
			    new Product("Phone", "Electronics", 800.00, false),   
			    new Product("Headphones", "Electronics", 150.00, true),
			    new Product("Monitor", "Electronics", 600.00, true),
			    new Product("Desk", "Furniture", 700.00, true)
				);
		
		List<String> available = pd.stream()
									.filter(p -> p.isInStock())
									.filter(p -> p.getCategory().equalsIgnoreCase("Electronics"))
									.filter(p -> p.getPrice() > 500.00)
									.map(Product::getName)
									.map(String::toUpperCase)
									.toList();
		
		System.out.println(available);
									
	}
}
