package keywords.this_super_final;

 class BankAcc{
	 
	 String accHolder ;
	 int balance ;
	 final int BANK1002 ;
	 
	 public BankAcc(String accHolder ,int balance) {
		 
		 this.accHolder = accHolder ;
		 this.balance = balance ;
	 }
	 
	 public BankAcc(final int BANK1002) {
		 
		 this.BANK1002 = BANK1002 ;
	 }
	 
 }

public class Banker {

}
