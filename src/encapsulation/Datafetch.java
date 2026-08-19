package encapsulation;

import controlflow.Datasetter;

public class Datafetch {

// the another class we fetching the data is in the controlflow pkg
	
	public static void main(String[] args) {
		
		Datasetter data = new Datasetter();
		data.sendData();
	}
	
	public void getData(Datasetter data) {
		
		System.out.println(data.getName());
		System.out.println(data.getID());
		System.out.println(data.getSalary());
		System.out.println(data.getState());
		
	}
	
	
	
}
