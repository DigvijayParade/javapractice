package method_reference;

import java.util.Objects;

public class Students {

	private String name ;
	private int id ;
	private String depName ;
	
	public Students(String name, int id,String depName) {
		
		this.name = name ;
		this.depName = depName ;
		this.id = id ;
	}
	public Students() {}
	
	public void setName(String n) {
		
		this.name = n ;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", depName=" + depName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(depName, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(depName, other.depName) && id == other.id && Objects.equals(name, other.name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getName() {
		return name;
	}
	
	public static void validateStd(Students s) {
		
		if(s.getName() != null && s.getId() < 100 && s.getDepName().equalsIgnoreCase("MCA")) {
			
			System.out.println("Real Student..........");
		}
	}
	
}
