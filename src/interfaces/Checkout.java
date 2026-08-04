package interfaces;

import java.util.ArrayList;

interface PaymentMethod{
	
	void processPayment(double amount);
	
	public default void printReceipt(double amount) {
		
		System.out.println("Receipt generated for $ :"+" "+amount);
	}
}

class Creditcard implements PaymentMethod{
	
	@Override 
	public void processPayment(double amount) {
		
		System.out.println("\"Charging $X to Credit Card...\""+" "+amount);
	}
}

class PayPal implements PaymentMethod{
	
	@Override
	public void processPayment(double amount) {
		
		System.out.println("Transferring $X via PayPal account..."+" "+amount);
	}
}

class CryptoWallet implements PaymentMethod{

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Broadcasting $X transaction to the Blockchain..."+" "+amount);
		
	}
	
	
}

public class Checkout {

	public static void main(String[] args) {
		
		ArrayList <PaymentMethod> gyat =  new ArrayList <>();
		
		PaymentMethod obj = new Creditcard();
		PaymentMethod obj1 = new PayPal();
		PaymentMethod obj2 = new CryptoWallet();
		
		gyat.add(obj);
		gyat.add(obj1);
		gyat.add(obj2);
		
		gyat.get(1);
		
		for(PaymentMethod p : gyat) {
			
			p.processPayment(400.00);
			
		}
	}
}
