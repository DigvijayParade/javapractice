package collection_framworks;

import java.util.Objects;

public class StudentData {

	private String name ;
	private int id ;
	
	public StudentData() {}
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", id=" + id + "]";
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
		StudentData other = (StudentData) obj;
		return id == other.id && Objects.equals(name, other.name);
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
	public StudentData(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}
