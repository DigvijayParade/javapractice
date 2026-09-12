package stream_api;

import java.util.Objects;

public class ProductData {

	private String pdName ;
	private int pdId ;
	private double price ;
	
	public ProductData() {}
	public ProductData(String pdname ,int pdId,double price) {
		
		this .pdId = pdId ;
		this.pdName = pdname;
		this.price = price ;
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductData [pdName=" + pdName + ", pdId=" + pdId + "]";
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pdId, pdName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductData other = (ProductData) obj;
		return pdId == other.pdId && Objects.equals(pdName, other.pdName);
	}
}
