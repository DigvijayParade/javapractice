package stream_api;

import java.util.List;
import java.util.Objects;

public class Order {

	private int orderId ;
	private String customerName ;
	private List<Product> Products  ;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Product> getProducts() {
		return Products;
	}
	public void setProducts(List<Product> products) {
		Products = products;
	}
	public Order(int orderId, String customerName, List<Product> products) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		Products = products;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Products, customerName, orderId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(Products, other.Products) && Objects.equals(customerName, other.customerName)
				&& orderId == other.orderId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", Products=" + Products + "]";
	}
	
	
}
