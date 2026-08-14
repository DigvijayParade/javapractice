package keywords.this_super_final;

 class BankAcc{
	 
	 String accHolder ;
	 int balance ;
	 final int routingNum = 1001;
	 
	 public BankAcc(String accHolder ,int balance) {
		 
		 this.accHolder = accHolder ;
		 this.balance = balance ;
	 }
	 
	 public BankAcc(String accHolder) {
		 
		    this(accHolder, 100); 
		}
	 
	 void displayInfo() {
		 
		 System.out.println("Account Holder Name : "+accHolder);
		 System.out.println("Balance : "+balance);
		 System.out.println("Routing Number : "+routingNum);
	 }
	 
	final void verifySecurity() {
		
		System.out.println("Identity Verified by Bank Policy");
	} 
	
 public  BankAcc applyFee(double fee) {
		
		if(balance >= fee) {
			
			balance  -= fee ;
			
			System.out.println("Remainig Balance : "+balance);
		}
		
		else{
			
			System.out.println("Not Enough balance !!");
			
		}
		
		return this ;
	}
	 
 }

 class SavingAcc extends BankAcc{
	 
	 double interestRate ;
	 
	 public SavingAcc(String accHolder ,int balance ,double interestRate) {
		 
		 super(accHolder ,balance);
		 this.interestRate = interestRate ;
		 
	 }
	 
	 @Override 
	 public void displayInfo() {
		 
		 super.displayInfo();
		 System.out.println("Interest rate : "+interestRate);
	 }
	 
	void sendAuditor() {
		
		Auditor ad = new Auditor();
		ad.checkOut(this);
	}
	 
 }
 
 class Auditor{
	 
	 void checkOut(SavingAcc acc) {
		 
		 System.out.println("Auditin account for : "+acc.accHolder);
	 }
 }
 
 final class VIPsaveacc extends SavingAcc{ 
	 
	 public VIPsaveacc(String accHolder ,int balance ,double interestRate) {
		 
		 super(accHolder ,balance , interestRate);
	 }
 }
public class Banker {

	public static void main(String[] args) {
		
	BankAcc b1 = new BankAcc("Nanu");
	b1.displayInfo();
	
	b1.applyFee(20).applyFee(30);
	
	SavingAcc s1 = new SavingAcc("Nanu", 500, 4.5);
	
	s1.displayInfo();
	
	s1.verifySecurity();
	
	s1.sendAuditor();
	
	VIPsaveacc vip = new VIPsaveacc("Gannu", 10000, 8.0);
	vip.displayInfo();
	
	}
	
}
