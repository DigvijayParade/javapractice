package stream_api;

import java.util.List;

public class Mains {

	public static void main(String[] args) {
		
		List<Employeess> employees = List.of(
			    new Employeess(101, "Niko Bellic", "Security", 75000.00, true),
			    new Employeess(102, "Roman Bellic", "Logistics", 45000.00, true),
			    new Employeess(103, "Little Jacob", "Sales", 62000.00, true),
			    new Employeess(104, "Brucie Kibbutz", "Fitness", 88000.00, false),
			    new Employeess(105, "Mallorie Bardas", "Logistics", 52000.00, true),
			    new Employeess(106, "Dimitri Rascalov", "Security", 95000.00, false)
			);
		
		List<String> empName = employees.stream()
								.filter(e -> e.getSalary() > 50000.00)
								.map(Employeess::getName)
								.toList();
		
		System.out.println(empName);
	}
}
