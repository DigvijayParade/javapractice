package stream_api;

import java.util.ArrayList;
import java.util.List;

public class Mainsk {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle(1, "Ninja 400", "Kawasaki", VehicleType.TWO_WHEELER, 5500.00, "Green", List.of("ABS", "Slipper Clutch"));
        Vehicle v2 = new Vehicle(2, "CBR500R", "Honda", VehicleType.TWO_WHEELER, 7000.00, "Red", List.of("ABS", "LED Lights"));
        Vehicle v3 = new Vehicle(3, "Civic", "Honda", VehicleType.FOUR_WHEELER, 24000.00, "Blue", List.of("Sunroof", "Lane Assist", "Apple CarPlay"));
        Vehicle v4 = new Vehicle(4, "Mustang GT", "Ford", VehicleType.FOUR_WHEELER, 45000.00, "Black", List.of("V8 Engine", "Leather Seats", "Track Mode"));
        Vehicle v5 = new Vehicle(5, "Model 3", "Tesla", VehicleType.FOUR_WHEELER, 39000.00, "White", List.of("Autopilot", "Sunroof", "Heated Seats"));
        Vehicle v6 = new Vehicle(6, "Activa 6G", "Honda", VehicleType.TWO_WHEELER, 1200.00, "Grey", List.of("CBS", "Silent Start"));

        
        DealerShip d1 = new DealerShip(101, "Apex Motors", "New York", List.of(v1, v3, v4));
        DealerShip d2 = new DealerShip(102, "Urban Wheels", "Los Angeles", List.of(v2, v5));
        DealerShip d3 = new DealerShip(103, "Metro Auto", "New York", List.of(v6));
        DealerShip d4 = new DealerShip(104, "Empty Motors", "Chicago", null);

        List<DealerShip> dealerships = new ArrayList<>(List.of(d1, d2, d3, d4));
        
        List<String> uniqueFeatures = dealerships.stream()
        								.filter(d -> d != null && d.getVehicles() != null)
        								.flatMap(d -> d.getVehicles().stream())
        								.filter(v -> v.getType() == VehicleType.FOUR_WHEELER && v.getPrice() > 20000.00)
        								.flatMap(v -> v.getFeatures().stream())
        								.distinct()
        								.toList();
        
        System.out.println(uniqueFeatures);
	}
}
