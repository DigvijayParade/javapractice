package interview_prep;

import java.util.Objects;

public class Students {

	private String name ;
	private int id ;
	private String gender ;
	private int standard ;
	
	public Students() {}

	public Students(String name, int id, String gender, int standard) {
		
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.standard = standard;
	}
	public static void main(String[] args) {
		
		Students s1 = new Students("Nanu",101,"Male",12);
		System.out.println(s1);
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

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(name,gender,standard,id);
	}
	@Override
	public boolean equals(Object o) {
		
		if(this == o)
			return true ;
		if(o == null)
			return false ;
		if(this.getClass() != o.getClass())
			return false ;
		Students other = (Students)o;
		return Objects.equals(gender, other.gender)
				&& id == other.id 
		        && Objects.equals(name, other.name)
		        && standard == other.standard;
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+"ID : "+id+"Gender : "+gender+"standard : "+standard ;
	}
	
}
