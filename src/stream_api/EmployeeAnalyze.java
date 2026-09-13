package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAnalyze {

	public static void main(String[] args) {

		EmployeeAnalyze obj = new EmployeeAnalyze();
		ArrayList<EmployeeData> empList = obj.getEmpData();

		// Concept 1: Sorting, Limiting, and Collecting into a new List
		List<String> topPerformers = empList.stream()
				.sorted(Comparator.comparingInt(EmployeeData::getScore).reversed())
				.limit(3)
				.map(e -> e.getName())
				.collect(Collectors.toList());

		System.out.println("Top 3 Performers: " + topPerformers);

		// Concept 2: Extracting unique values with distinct()
		empList.stream()
				.map(e -> e.getDepartment())
				.distinct()
				.forEach(dept -> System.out.println("Department: " + dept));
	}

	public ArrayList<EmployeeData> getEmpData() {
		return new ArrayList<>(List.of(
			new EmployeeData("Alex", "IT", 75000.00, 88),
			new EmployeeData("Brian", "HR", 50000.00, 92),
			new EmployeeData("Catherine", "IT", 82000.00, 95),
			new EmployeeData("Daniel", "Finance", 68000.00, 85),
			new EmployeeData("Ella", "HR", 54000.00, 90),
			new EmployeeData("Felix", "Finance", 72000.00, 95)
		));
	}
}