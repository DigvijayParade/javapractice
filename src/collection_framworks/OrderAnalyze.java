package collection_framworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderAnalyze {
	
	public static void main(String[] args) {
		
		Order o1 = new Order(501, "Aarav", "Electronics", 2500.0);
		Order o2 = new Order(502, "Sneha", "Books", 600.0);
		Order o3 = new Order(501, "Aarav", "Electronics", 2500.0); // Duplicate submission!
		Order o4 = new Order(503, "Rohan", "Clothing", 1500.0);
		Order o5 = new Order(504, "Sneha", "Electronics", 4200.0);
		Order o6 = new Order(505, "Kabir", "Books", 600.0);        // Same price as o2!
		Order o7 = new Order(506, "Aarav", "Clothing", 1200.0);
		
		
		ArrayList<Order> odList = new ArrayList<>();
		
		odList.add(o1);
		odList.add(o2);
		odList.add(o3);
		odList.add(o4);
		odList.add(o5);
		odList.add(o6);
		odList.add(o7);
		
		System.out.println(odList);
		System.out.println(odList.get(2));
		
		Set<Order> uniqueOrders = new LinkedHashSet<>(odList);
		
		uniqueOrders.forEach(System.out::println);
		
		System.out.println(uniqueOrders.size());
		
		Map<Integer, Order> orderLookup = new HashMap<>();
		
		orderLookup.put(o1.orderId, o1);
		orderLookup.put(o2.orderId, o2);
		orderLookup.put(o3.orderId, o3);
		orderLookup.put(o4.orderId, o4);
		orderLookup.put(o5.orderId, o5);
		orderLookup.put(o6.orderId, o6);
		orderLookup.put(o7.orderId, o7);
		
		System.out.println(orderLookup);
		
		System.out.println(orderLookup.get(504));
		orderLookup.containsKey(999);
		
		List<Order> books =odList.stream()
				.filter(o -> o != null )
				.filter(o -> o.getCategory().equalsIgnoreCase("Books"))
				.toList();
		
		System.out.println(books);
		
		
		Map<Object, List<Order>> cat =odList.stream()
				.filter(o -> o != null)
				.collect(Collectors.groupingBy(o -> o.getCategory()));
		
		
		System.out.println("////////////////////");
		System.out.println(cat);
		
		
				
				
	}

}
