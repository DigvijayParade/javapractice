package stream_api;

import java.util.Objects;

public class Mobile {

	private String name ;
	private int id ;
	private double price ;
	private String model ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, model, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return id == other.id && Objects.equals(model, other.model) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", id=" + id + ", price=" + price + ", model=" + model + "]";
	}
	public Mobile(String name, int id, double price, String model) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.model = model;
	}
	
	
}
