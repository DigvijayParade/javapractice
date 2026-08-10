package keywords.this_super_final;

interface PaymentGateway{
	
	public void processpayment(double amount);
}

abstract class BasePayment implements PaymentGateway{
	
	final String currency = "USD" ;
	String tranid ;
	public BasePayment (String tranid) {
		
		this.tranid = tranid ;
		
	}
	
	@Override
	public final void processpayment(double amount) {
		
		System.out.println("Currency : "+currency);
		System.out.println("Amount : "+amount);
		System.out.println("tranid : "+tranid);
	}
	
}

public class Credicardpay extends BasePayment{

	public Credicardpay(String tranid) {
		
		super(tranid);
	}
	public static void main(String[] args) {
		
	Credicardpay c1 = new Credicardpay("124hg4249");
	
	c1.processpayment(100.0);
	
}
}
