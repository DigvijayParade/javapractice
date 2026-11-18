package scannerTopic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import stream_api.Mobile;

public class MobEng {

	public static void main(String[] args) {
		
		List<Mobile> mobiles = Arrays.asList(
			    new Mobile("Apple", 101, 1099.00, "iPhone 15 Pro"),
			    new Mobile("Samsung", 102, 899.99, "Galaxy S23"),
			    new Mobile("Apple", 103, 799.00, "iPhone 14"),
			    new Mobile("Google", 104, 699.00, "Pixel 8"),
			    new Mobile("OnePlus", 105, 599.50, "Nord 3"),
			    new Mobile("Samsung", 106, 1199.00, "Galaxy Z Fold 5"),
			    new Mobile("Google", 107, 499.00, "Pixel 7a"),
			    new Mobile("Xiaomi", 108, 299.99, "Redmi Note 12")
			);
		
		List<String> expensive = mobiles.stream()
									.filter(m -> m != null)
									.filter(m -> m.getPrice() > 700.00)
									.map(m -> m.getName())
									.collect(Collectors.toList());
		
		System.out.println(expensive);
		
		Map<String, List<Mobile>> groupedByBrand = mobiles.stream()
				.filter(m -> m != null)
				.collect(Collectors.groupingBy(m -> m.getName()));
		
		System.out.println("/////////////////////////////");
		
		System.out.println(groupedByBrand);
				
	}
}

