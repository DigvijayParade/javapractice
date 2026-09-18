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
		
//		List<String> femaleEmp = empList.stream()
//								.filter(e -> e.getGender().equalsIgnoreCase("Female"))
//								.map(e -> e.getName())
//								.toList();
//		
//		System.out.println("Female Employees ....");
//		
//		for (String f : femaleEmp) {
//			
//			System.out.println(f);
//		}
		
		int femalecount = 0 ;
		
		for (Employees e : empList) {
			
			if(e.getGender().equalsIgnoreCase("Female")) {
				
				femalecount ++;
			}
			
		}
		System.out.println(femalecount);
	}
	
}
