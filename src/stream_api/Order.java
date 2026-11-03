package stream_api ;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order{
	
	private int orderId ;
	private String customerName ;
	private Product product ;
	private int quantity ;
	private String status ;
	
	public Order() {}

	@Override
	public int hashCode() {
		return Objects.hash(customerName, orderId, product, quantity, status);
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
		return Objects.equals(customerName, other.customerName) && orderId == other.orderId
				&& Objects.equals(product, other.product) && quantity == other.quantity
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", product=" + product + ", quantity="
				+ quantity + ", status=" + status + "]";
	}

	public Order(int orderId, String customerName, Product product, int quantity, String status) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.product = product;
		this.quantity = quantity;
		this.status = status;
	}

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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		
		// Products
		Product p1 = new Product(101, "Laptop", "Electronics", 1200.00, 4.5);
		Product p2 = new Product(102, "Mouse", "Accessories", 25.00, 4.2);
		Product p3 = new Product(103, "Monitor", "Electronics", 300.00, 4.8);
		Product p4 = new Product(104, "Budget Earbuds", "Accessories", 15.00, 2.5);
		Product p5 = new Product(105, "Mechanical Keyboard", "Accessories", 80.00, 4.0);
		Product p6 = new Product(106, "Smart Watch", "Electronics", 250.00, 4.1);

		// Orders List
		List<Order> orderList = new ArrayList<>(List.of(
		    new Order(1, "Alice", p1, 1, "DELIVERED"),                         // Total: 1200.00
		    new Order(2, "Bob", p2, 2, "DELIVERED"),                           // Total: 50.00
		    new Order(3, "Charlie", p3, 2, "DELIVERED"),                       // Total: 600.00
		    new Order(4, "Dave", p4, 1, "PENDING"),                            // Total: 15.00 (Rating < 3.0)
		    new Order(1, "Alice", p1, 1, "DELIVERED"),                         // DUPLICATE of Order 1
		    new Order(5, "Eve", p5, 3, "PENDING"),                             // Total: 240.00
		    new Order(6, "Frank", p6, 1, "DELIVERED"),                         // Total: 250.00
		    new Order(7, "Grace", p2, 1, "CANCELLED"),                         // Total: 25.00
		    new Order(),                                                        // Edge case: uninitialized order
		    new Order(8, "Hank", new Product(107, "Bad Cable", "Accessories", null, 1.0), 2, "PENDING") // Edge case: null price
		));
		
		
		List<String> highValue = orderList.stream()
									.filter(o -> o != null)
									.filter(o -> o.getProduct() != null)
									.filter(o -> o.getProduct().getCategory() != null)
									.filter(o -> o.getProduct().getPrice() != null)
									.filter(o -> o.getStatus() != null)
									.filter(o -> o.getStatus().equalsIgnoreCase("DELIVERED"))
									.filter(o -> o.getProduct().getCategory().equalsIgnoreCase("Electronics"))
									.filter(o -> o.getProduct().getPrice() > 100.00)
									.distinct()
									.map(Order::getCustomerName)
									.toList();
		
		System.out.println(highValue);
		
		double total = orderList.stream()
						.filter(o -> o != null && o.getProduct() != null && o.getProduct().getPrice() != null)
						.filter(o -> "DELIVERED".equalsIgnoreCase(o.getStatus()))
						.distinct()
						
						.mapToDouble(o -> o.getQuantity() * o.getProduct().getPrice())
						.sum();
						
	System.out.println(total);
	
	boolean check = orderList.stream()
			.filter(o -> o != null && o.getProduct() != null && o.getProduct().getPrice() != null)
//			.filter(o -> o.getStatus().equalsIgnoreCase("pending") && o.getProduct().getRating() < 3.0)
			.anyMatch(o -> o.getStatus().equalsIgnoreCase("pending") && o.getProduct().getRating() < 3.0);
	
	System.out.println(check);
	}
}