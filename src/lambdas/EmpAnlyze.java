package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmpAnlyze {

	public static Function<Employee,String> name = e -> e.getName();
	
	public static void main(String[] args) {
		
		List<Employee> sampleEmployees = List.of(
			    new Employee(101, "Alice", "IT", 75000.0),
			    new Employee(102, "Bob", "HR", 48000.0),
			    new Employee(103, "Charlie", "Finance", 95000.0),
			    new Employee(104, "Diana", "IT", 110000.0),
			    new Employee(105, "Ethan", "Sales", 52000.0),
			    new Employee(106, "Fiona", "HR", 63000.0)
			);

			ArrayList<Employee> empList = new ArrayList<>(sampleEmployees);
			
			empList.stream().filter(e -> e.getSalary() > 50000)
			.map(Employee :: getName)
			.forEach(System.out::println);
	}
}
