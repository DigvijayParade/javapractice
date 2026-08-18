package encapsulation;

import controlflow.Employee;

public class Company {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.sendData();		
			
	}
	
	public void getData(Employee emp) {
		
		System.out.println(emp.getname());
		System.out.println(emp.getSalary());
	}
	
}