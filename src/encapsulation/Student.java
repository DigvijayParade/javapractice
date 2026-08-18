package encapsulation;

public class Student {

	private String name ;
	private int age ;
	private int id ;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setInfo("Nanu",38,18);
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		System.out.println(s1.getAge());
		
		
		
	}
	void setInfo(String newName ,int newID , int newAge) {
		
		if(newName != null && !newName.trim().isEmpty()) {
			
			this.name = newName ;
		}
		else {
			
			System.out.println("invalid input");
		}
		
		if(newID > 0 && newID < 100) {
			
			this.id = newID ;
			
		}
		else {
			
			System.out.println("Invalid input !!");
		}
		
		if(newAge > 0 && newAge < 28) {
			
			this.age = newAge ;
			
		}
		
	}
	
	String getName() {
		
		return this.name ;
	}
	
	int getId() {
		
		return this.id ;
	}
	
    int getAge() {
		
		return this.age ;
	}
}
