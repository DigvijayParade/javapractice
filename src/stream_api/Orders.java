package stream_api;

public class Orders {

	private int orderId ;

	private String customerName ;

	private double amount ;
	
	private String status ;
	
	public Orders() {}

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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerName=" + customerName + ", amount=" + amount + ", status="
				+ status + "]";
	}

	public Orders(int orderId, String customerName, double amount, String status) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
		this.status = status;
	}

	
	
}
