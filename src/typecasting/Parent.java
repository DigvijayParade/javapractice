package typecasting ;

import java.util.Objects;

class Child extends Parent {

	public Child(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Parent p = new Child("Nanu");
		
		Child c = (Child)p ;
		
		System.out.println(c);
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name ;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    
	    Child other = (Child) o; 
	    return Objects.equals(name, other.name);
		
	}
	
	
}

public class Parent {
	
	String name ;
	
	public Parent(String name) {
		
		this.name = name ;
	}
	
	public static void main(String[] args) {
		
	}
}