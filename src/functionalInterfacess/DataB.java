package functionalInterfacess;

import java.util.Objects;

public class DataB {

	private String name ;
	private int id ;
	
	public DataB() {}
	public DataB(String name,int id) {
		
		this.name = name ;
		this.id = id ;
		
	}
	public static void main(String[] args) {
		
		
	}
	public void setName(String name ) {
		
		this.name = name ;
	}
	public String getName() {
		
		return this.name;
	}
	public void setId(int id) {
		
		this.id = id ;
	}
	public int getId() {
		
		return this.id ;
	}
	
	@Override
	public String toString() {
		
		return "Name : "+this.name+"||"+"ID : "+this.id;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(this.id,this.name);
		
		}
	@Override
	public boolean equals(Object o) {
		
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false ;
		
		DataB other = (DataB) o; 
		
		return id == other.id && Objects.equals(name, other.name);
	}
}
