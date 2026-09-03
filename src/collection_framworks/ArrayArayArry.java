package collection_framworks;

import java.util.*;

public class ArrayArayArry {
	int id ;
	String name ;
	
	public ArrayArayArry (int id ,String name ) {
		this.name = name ;
		this.id = id ;
	
	}
	public void Setname (String name ) {
		this.name = name ;
	}
	public String Getname () {
		return this.name ;
	
	}

	public void Setid (int id  ) {
		this.name = name ;
	}
	public String Getid () {
		return this.name ;
	
	}


	public static void main (String [] args ) {
		
		ArrayList<ArrayArayArry> done = new ArrayList <>(
				
				List.of(new ArrayArayArry(101,"Nanu"),
						new ArrayArayArry(102,"Gannu"))
				);
		
		for(ArrayArayArry o : done) {
			
			System.out.println(o.toString());
		}
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+"||"+"ID : "+id ;
	}
}
