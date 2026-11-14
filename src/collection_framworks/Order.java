package collection_framworks;

import java.util.*;

public class Order {
    @Override
	public int hashCode() {
		return Objects.hash(amount, category, customer, orderId);
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
				&& Objects.equals(category, other.category) && Objects.equals(customer, other.customer)
				&& orderId == other.orderId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	int orderId;
    String customer;
    String category;
    double amount;

    public Order(int orderId, String customer, String category, double amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{#" + orderId + ", " + customer + ", " + category + ", ₹" + amount + "}";
    }
}