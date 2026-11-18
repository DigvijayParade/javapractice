package stream_api ;

import java.util.List;
import java.util.Objects;

public class Vehicle{
	
	private int id ;
	private String name ;
	private String brand ;
	private VehicleType type ;
	private double price ;
	private String color ;
	private List<String> features ;
	
	public Vehicle() {}
	
	public Vehicle(int id, String name, String brand, VehicleType type, double price, String color,
			List<String> features) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
		this.features = features;
	}
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", brand=" + brand + ", type=" + type + ", price=" + price
				+ ", color=" + color + ", features=" + features + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, features, id, name, price, type);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(features, other.features) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && type == other.type;
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
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getFeatures() {
		return features;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
}