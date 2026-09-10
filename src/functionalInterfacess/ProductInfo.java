package functionalInterfacess;

import java.util.Objects;

public class ProductInfo {

	private String pdname ;
	private int pdId ;
	private double price ;
	public ProductInfo() {
		
	}
	public ProductInfo(String pdname, int pdId, double price, boolean isExpired) {
		
		this.pdname = pdname;
		this.pdId = pdId;
		this.price = price;
		this.isExpired = isExpired;
	}
	@Override
	public String toString() {
		return "ProductInfo [pdname=" + pdname + ", pdId=" + pdId + ", price=" + price + ", isExpired=" + isExpired
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(isExpired, pdId, pdname, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductInfo other = (ProductInfo) obj;
		return isExpired == other.isExpired && pdId == other.pdId && Objects.equals(pdname, other.pdname)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	public String getPdname() {
		return pdname;
	}
	public void setPdname(String pdname) {
		this.pdname = pdname;
	}
	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isExpired() {
		return isExpired;
	}
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}
	private boolean isExpired ;
}
