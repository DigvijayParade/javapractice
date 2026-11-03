package stream_api;

import java.util.ArrayList;
import java.util.List;

public class EmpOpr {

	public static void main(String[] args) {
		
		ArrayList<Employees> empList = new ArrayList<>(List.of(
	            new Employees("Alex Johnson", 45, "Male", 95000.00),
	            new Employees("Jane Smith", 34, "Female", 72000.00),
	            new Employees("Emily Davis", 23, "Female", 48000.00),
	            new Employees("Michael Brown", 30, "Male", 61000.00),
	            new Employees("Sarah Wilson", 29, "Female", 83000.00),
	            new Employees("David Taylor", 50, "Male", 110000.00),
	            new Employees("John Doe", 28, "Male", 55000.00),
	            new Employees("Jane Smith", 34, "Female", 72000.00) 
	        ));
		
		long richCount = empList.stream()
						.filter(e -> e.getSalary() > 60000.00)
						.distinct()
						.count();
		
		System.out.println(richCount);
		
		long females = empList.stream()
				.filter(e -> e.getGender().equalsIgnoreCase("Female"))
				.distinct()
				.count();
		
		System.out.println(females);
	}
	
}
