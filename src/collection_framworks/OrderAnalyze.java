package collection_framworks;

import java.util.HashSet;
import java.util.Set;

public class OrderAnalyze {
	
	public static void main(String[] args) {
		
		Order o1 = new Order(501, "Aarav", "Electronics", 2500.0);
		Order o2 = new Order(502, "Sneha", "Books", 600.0);
		Order o3 = new Order(501, "Aarav", "Electronics", 2500.0); // Duplicate submission!
		Order o4 = new Order(503, "Rohan", "Clothing", 1500.0);
		Order o5 = new Order(504, "Sneha", "Electronics", 4200.0);
		Order o6 = new Order(505, "Kabir", "Books", 600.0);        // Same price as o2!
		Order o7 = new Order(506, "Aarav", "Clothing", 1200.0);
		
		
		Set<Order> od = new HashSet<>(Set.of(o1,o2,o3,o4,o5,o6,o7));
		
		od.forEach(System.out::println);
	}

}
