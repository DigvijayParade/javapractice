package pojo_classes;

import java.util.Objects;

public class DemoClass {

	private String name ;
	private int id ;
	
	public DemoClass() {}
	
	public DemoClass(String name ,int id) {
		
		this.name = name ;
		this.id = id ;
	}
	
	public void setName(String name) {
		
		this.name = name ;
	}
	
	public void setId(int id) {
		
		this.id = id ;
	}
	
	public String getName () {
		
		return this.name ;
	}
	
	public int getId() {
		
		return this.id ;
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+" "+"ID : "+id ;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoClass other = (DemoClass) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}
