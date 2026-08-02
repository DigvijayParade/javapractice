package inheritance;

class BankAcc{
	
	String accountHolder;

	double balance;
	
	public BankAcc(String accountHolder , double balance) {
		
		this.accountHolder =  accountHolder;
		this. balance = balance;
	}
	
	void depoait(double amount) {
		
		if (amount > 0) {
			
			System.out.println(amount+" "+"deposited succesfully");
		}else {
			
			System.out.println("Invalid amount");
		}
	}
	void withdraw(double amount) {
		
		if(amount <= amount) {
			
			System.out.println((amount - amount)+" "+"withdrwed from your account");
		}
		else {
			
			System.out.println("you dont have enought balance to make this withdraw");
		}
	}
}

class SavingAcc extends BankAcc{
	
	double minBalance = 500.0;
	
	public SavingAcc(String accountHolder , double balance){
		
		super(accountHolder ,balance);
	}
	
	public static void main(String[] args) {
		
		SavingAcc obj = new SavingAcc("Yeda pandu",800.00);
		obj.withdraw(400.00);
	}
	
	@Override
	void withdraw(double amount) {
		
		if(amount <= 0) {
			
			System.out.println("Withdrawal amount must be positive!");
		}
		else if((balance - amount) >= minBalance) {
			
			System.out.println("Withdrew $"+" "+amount+" "+" New Balance: $"+" "+balance);
		}
		else if(balance >= amount) {
			
			 	System.out.println("\"Transaction Failed! Savings account must maintain at least $500 balance.\"");
		}
		else {
			
			System.out.println("\"Transaction Failed! Insufficient total funds.");
		}
		
	}
}

//public class SavingAcc {
//
//}
