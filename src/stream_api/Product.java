package stream_api ;

import java.util.Objects;

public class Product{
	
	private int id ;
	private String name ;
	private String category ;
	private Double price ;
	private double rating ;
	
	public Product() {}

	public Product(int id, String name, String category, Double price, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", rating="
				+ rating + "]";
	}
	
	
}