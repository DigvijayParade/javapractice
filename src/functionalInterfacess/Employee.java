package functionalInterfacess;

import java.util.Objects;

public class Employee {
	
	private String empName ;
	private int empId ;
	
	public Employee(String empName, int empId) {
		
		this.empName = empName;
		this.empId = empId;
	}
	
public Employee() {
		
		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
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
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
