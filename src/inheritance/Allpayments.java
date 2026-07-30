package inheritance;

public class Allpayments {

	String username;
	int userid;
	public Allpayments(String username ,int userid){
		
		this.username = username;
		this.userid = userid;
	}
	
	public void netbank(int amount) {
		
		System.out.println(username+" "+"paid"+" "+amount+" "+"through the netbanking");
	}
	public void debitcard(int amount) {
		
		System.out.println(username+" "+"paid"+" "+amount+" "+"through the debitcard");
	}
	public void creditcard(int amount) {
		
		System.out.println(username+" "+"paid"+" "+amount+" "+"through the creditcard");
	}
	public void upi(int amount) {
		
		System.out.println(username+" "+"paid"+" "+amount+" "+"through the creditcard");
	}
}
