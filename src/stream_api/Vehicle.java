package stream_api;

import java.util.Objects;

class TwoWheeler{
	
	private String name ;
	private int id ;
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
	public TwoWheeler(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TwoWheeler other = (TwoWheeler) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "TwoWheeler [name=" + name + ", id=" + id + "]";
	}
}

class FourWheeler{
	
	private int id ;
	private String name ;
	@Override
	public String toString() {
		return "FourWheeler [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FourWheeler other = (FourWheeler) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	public FourWheeler(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}


public class Vehicle {

	private String ve_Name ;
	private int ve_id ;
	private TwoWheeler tw ;
	private FourWheeler fw ;
	private double price ;
	private String color ;
	
	public Vehicle() {}

	public Vehicle(String ve_Name, int ve_id, TwoWheeler tw, FourWheeler fw, double price, String color) {
		super();
		this.ve_Name = ve_Name;
		this.ve_id = ve_id;
		this.tw = tw;
		this.price = price;
		this.color = color;
	}

	public Vehicle(String ve_Name, int ve_id, FourWheeler fw, double price, String color) {
		super();
		this.ve_Name = ve_Name;
		this.ve_id = ve_id;
		this.fw = fw;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [ve_Name=" + ve_Name + ", ve_id=" + ve_id + ", tw=" + tw + ", fw=" + fw + ", price=" + price
				+ ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, fw, price, tw, ve_Name, ve_id);
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
		return Objects.equals(color, other.color) && Objects.equals(fw, other.fw)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(tw, other.tw) && Objects.equals(ve_Name, other.ve_Name) && ve_id == other.ve_id;
	}
}
