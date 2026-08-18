package controlflow;

import encapsulation.Company;

public class Employee {

	private String name ;
	private double salary ;
	
	public void sendData() {
		
		Employee emp = new Employee();
		emp.name = "Nanu" ;
		emp.salary = 45000.00 ;
		
		Company c = new Company();
		c.getData(emp);
		emp.getname();
		emp.getSalary();
	}
	
	public String getname() {
		
		return this.name ;
	}
	
	public double getSalary() {
		
		return this.salary ;
	}
	
}
	
