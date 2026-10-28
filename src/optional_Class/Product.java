package optional_Class;

public class Product {

	private String pdname ;
	private int pdID ;
	private double price ;
	
	public Product() {
}

	public Product(String pdname, int pdID, double price) {
		
		this.pdname = pdname;
		this.pdID = pdID;
		this.price = price;
	}

	public String getPdname() {
		return pdname;
	}

	public void setPdname(String pdname) {
		this.pdname = pdname;
	}

	public int getPdID() {
		return pdID;
	}

	public void setPdID(int pdID) {
		this.pdID = pdID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}