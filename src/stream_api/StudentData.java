package stream_api;

import java.util.Objects;

public class StudentData {
	
	public StudentData() {}
	public StudentData(String name, int id, int age, int year, String dep) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.year = year;
		this.dep = dep;
	}
	private String name;
	private int id ;
	private int age ;
	private int year ;
	private String dep ;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, dep, id, name, year);
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
		return age == other.age && Objects.equals(dep, other.dep) && id == other.id && Objects.equals(name, other.name)
				&& year == other.year;
	}
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", id=" + id + ", age=" + age + ", year=" + year + ", dep=" + dep + "]";
	}
	
	
	
}
