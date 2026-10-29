package optional_Class;

import java.util.Optional;

public class CompanyApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(new Department("HR"));
		Employee e2 = new Employee(new Department(null));
		Employee e3 = new Employee(null);
		
		getDepName(e1);
		getDepName(e2);
		getDepName(e3);
	}
	
	public static void getDepName(Employee e) {
		
		String depName = Optional.ofNullable(e)
							.map(Employee::getDep)
							.map(Department::getDep_Name)
							.orElse("Invalid Input!!");
		
		System.out.println(depName);
	}
}
