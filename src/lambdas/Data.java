package lambdas;

import java.util.Objects;

public class Data {

	private String name ;
	private int id ;
	private double salary ;
	
	public Data() {}
	public Data(String name,int id,double salary) {
		
		this.name = name ;
		this.id = id ;
		this.salary = salary ;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name,id,salary);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o == this)
		return true ;
		if(o.) {}
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+"||"+"ID : "+id+"||"+"Salary : "+salary ;
	}
}
