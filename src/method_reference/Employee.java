package method_reference;

public class Employee {

	private String name ;
	private int id ;
	private String gender ;
	
	public Employee() {}
	public Employee(String name ,int id ,String gender) {
		
		this.name = name ;
		this.id = id ;
		this.gender = gender ;
	}
	
	public static void validateEmpDetails(Employee e) {
		
		if(e.getId() != 0 && e.getName() != null) 
			System.out.println( "Invalid EMployee");
			
		
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
}
