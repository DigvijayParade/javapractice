package stream_api ;

import java.util.List;

public class OrderApp{
	
	public static void main(String[] args) {
		
		List<Orders> pdList = List.of(
				
				new Orders(101, "alice smith", 250.50, "DELIVERED"),
			    new Orders(102, "bob jones", 80.00, "DELIVERED"),      
			    new Orders(103, "charlie brown", 450.00, "PENDING"),   
			    new Orders(104, "diana prince", 1200.00, "DELIVERED"),
			    new Orders(105, "evan wright", 310.00, "CANCELLED")
				
			);
		
		List<String> del = pdList.stream()
							.filter(o -> o.getStatus().equalsIgnoreCase("DELIVERED"))
							.filter(o -> o.getAmount() > 500.00)
							.map(Orders::getCustomerName)
							.toList();
		
		System.out.println(del);
	}
}