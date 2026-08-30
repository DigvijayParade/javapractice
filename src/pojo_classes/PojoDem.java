package pojo_classes;

import java.util.Objects;

public class PojoDem {

	private String name ;
	private int id ;
	
	public PojoDem() {}
	
	public PojoDem(String name ,int id) {
		
		this.name = name ;
		this.id = id ;
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

	@Override
	public String toString() {
		return "PojoDem [name=" + name + ", id=" + id + "]";
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
		PojoDem other = (PojoDem) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
