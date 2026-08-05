package abstractclasses;

abstract class Payment {
	
	protected double amount;
	protected String transactionId;
	
	public Payment(double amount , String transactionId) {
		
		this.amount = amount;
		this.transactionId = transactionId;
	}
	
	public abstract void processpayment();
	
	public void printreceipt() {
		
		System.out.println("TransactionID : "+" "+transactionId+" "+"Amount : "+amount );
	}
}

class CreditPayments extends Payment{
	
	String cardNumber;
	public CreditPayments(double amount , String transactionId,String cardNumber) {
		
		super(amount ,transactionId);
		this.cardNumber = cardNumber;
		
	}
	
	@Override
	public void processpayment() {
		
		System.out.println("Card Number : "+" "+cardNumber);
		System.out.println("Transaction Id : "+" "+transactionId);
		System.out.println("Amount : "+" "+amount);
	}
	
}

class Paypal extends Payment{

	String emailId;
	
	public Paypal(double amount , String transactionId,String emailId) {
		
		super(amount , transactionId);
		this.emailId = emailId;
	}

	@Override
	public void processpayment() {
		
		System.out.println("Emmail Id : "+" "+emailId);
		System.out.println("Transaction Id : "+" "+transactionId);
		System.out.println("Amount : "+" "+amount);
		
	}
}

public class ClassMain {

	public static void main(String[] args) {
		
		Payment p1 = new CreditPayments(500.00,"123456","123 456 789");
		p1.processpayment();
		p1.printreceipt();
		
		Payment p2 = new Paypal(500.00,"123456","nanu@gmail.com");
		p2.processpayment();
		p2.printreceipt();
		
	}
}
