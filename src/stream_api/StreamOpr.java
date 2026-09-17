package stream_api;

import java.util.ArrayList;
import java.util.List;

public class StreamOpr {

	public static void main(String[] args) {
		
		ArrayList<ProductData> pdList = new ArrayList<>();
		
		pdList.add(new ProductData("Laptop", 101, 1200.00));
		pdList.add(new ProductData("Smartphone", 102, 800.00));
		pdList.add(new ProductData("Headphones", 103, 150.00));
		pdList.add(new ProductData("Smartwatch", 104, 250.00));
		pdList.add(new ProductData("Wireless Mouse", 105, 25.00));
		pdList.add(new ProductData("Mechanical Keyboard", 106, 75.00));
		pdList.add(new ProductData("4K Monitor", 107, 350.00));
		pdList.add(new ProductData("Wireless Mouse", 105, 30.00));
		
		List<String> pdNamesgrt500 = pdList.stream().
									filter(e -> e.getPrice() > 500.00).
									map(e -> e.getPdName()).
									toList();
		
		System.out.println(pdNamesgrt500);
	}
}
