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
	   
	    if (this == o) return true;
	    
	    // 2. Null check and type check
	    if (o == null || getClass() != o.getClass()) return false;

	    Data data = (Data) o;
	
	    return id == data.id &&
	           Double.compare(data.salary, salary) == 0 &&
	           Objects.equals(name, data.name);
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+"||"+"ID : "+id+"||"+"Salary : "+salary ;
	}
}
