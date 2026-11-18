package stream_api;

import java.util.List;
import java.util.Objects;

public class DealerShip {

	private int id;

	@Override
	public String toString() {
		return "DealerShip [id=" + id + ", name=" + name + ", city=" + city + ", vehicles=" + vehicles + "]";
	}

	private String name;

	private String city;

	private List<Vehicle> vehicles;

	public DealerShip(int id, String name, String city, List<Vehicle> vehicles) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.vehicles = vehicles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, id, name, vehicles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DealerShip other = (DealerShip) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(vehicles, other.vehicles);
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
