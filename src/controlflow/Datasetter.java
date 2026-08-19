package controlflow;

import encapsulation.Datafetch;

public class Datasetter {

	private String name ;
	private int id ;
	private double salary ;
	private boolean isLoyal ;
	
	public void sendData() {
		
		//im not using the logivc here in the setter cause im lazy af i wiil just directly set the values
		Datasetter obj = new Datasetter();
		
		obj.name = "Nanu";
		obj.id = 38 ;
		obj.salary = 45000.00 ;
		obj.isLoyal = true ;
		
		Datafetch obj1 = new Datafetch();
		
		obj1.getData(obj);
		
		
	}
	
	public String getName() {
		
		return this.name ;
	}
public int getID() {
		
		return this.id ;
	}

public double getSalary() {
	
	return this.salary ;
}

public boolean getState(){
	
	return this.isLoyal ;
}
}
