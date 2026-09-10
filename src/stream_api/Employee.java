package stream_api;

import java.util.Objects;

public class Employee {

	private String empName ;
	private int empId ;
	private int empAge ;
	private double empSalary ;
	
	public Employee () {}
	
	public Employee (String empName,int empId,int empAge,double empSalary) {
	
		    this.empName = empName;
		    this.empId = empId;
		    this.empAge = empAge;
		    this.empSalary = empSalary; 
		
	}
	
	public void setName (String name ) {
		
		this.empName = name ;
		
	}
	public String getName() {
		
		return this.empName ;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empAge, empId, empName, empSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empAge == other.empAge && empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}
