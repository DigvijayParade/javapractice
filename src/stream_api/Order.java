package stream_api;

import java.util.Objects;

public class Order {

	private int orderId ;

	private String customerName ;

	private double amount ;

	private String status ;

	public Order(int orderId, String customerName, double amount, String status) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", amount=" + amount + ", status="
				+ status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, customerName, orderId, status);
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
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(customerName, other.customerName) && orderId == other.orderId
				&& Objects.equals(status, other.status);
	}
	
	
}
