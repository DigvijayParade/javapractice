package stream_api;

public class Product {

	private String name ;

	private String category ;

	private double price ;

	private boolean inStock ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public Product(String name, String category, double price, boolean inStock) {
	
		this.name = name;
		this.category = category;
		this.price = price;
		this.inStock = inStock;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + ", inStock=" + inStock + "]";
	}
	
	
}
