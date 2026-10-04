package functionalInterfacess;

import java.util.Objects;

public class RandomData {

	private String name ;
	private int id ;
	private String gender ;
	
	public RandomData() {}
	
	public RandomData(String name,int id,String gender) {
		
		this.name = name ;
		this.id = id ;
		this.gender = gender ;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name ,id ,gender);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    
	    RandomData that = (RandomData) o;
	    
		return this.id == that.id &&
		           Objects.equals(this.name, that.name) &&
		           Objects.equals(this.gender, that.gender);
		
		}
	
	@Override
	public String toString() {
		
		return "Name : "+name+"||"+"Id : "+id+"||"+" Gender : "+gender ;
	}
	
}
