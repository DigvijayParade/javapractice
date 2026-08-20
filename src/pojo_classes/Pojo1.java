package pojo_classes;

public class Pojo1 {

	private int id ;
	private String name ;
	private double price ;
	private String carEmail ;
	
	public void setID(int id) {
		
		this.id = id ;
	}
	
	public int gerID() {
		
		return this.id ;
		
	}
	
	public void setName (String name ) {
		
		this.name = name ;
	}
	
	public String getName() {
		
		return this.name ;
	}
	
	public void setPrice(double price) {
		
		this.price = price ;
	}
	
	public double getprice() {
		
		return this.price ;
	}
	
	public void setcarEmail(String email) {
		
		this.carEmail = email ;
	}
	
	public String getCarEmail() {
		
		return this.carEmail ;
	}
	
	public void sendData() {
		
		CarData c1 = new CarData();
		c1.displayData(this);
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+" id :"+id+" Price : "+price ;
	}
}


