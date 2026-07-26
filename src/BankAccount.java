public class BankAccount{
	
	static String bankName;
	static double interestRate;
	
	static {
		
		bankName = "SBI";
		interestRate = 4.5;
		System.out.println("Welcome to the"+" "+bankName);
		System.out.println(bankName +" "+"has a "+" "+interestRate+" "+"interest Rate");
	}
	String accHolder;
	int deposit;
	{
		
		System.out.println("New Account created ");
	}
	public BankAccount(String accHolder,int deposit) {
		
		this.accHolder = accHolder;
		this.deposit = deposit;
		System.out.println("New Account created as a : "+" "+this.accHolder);
		System.out.println(this.accHolder+" "+"deposited "+" "+this.deposit);
		
	}
	public static void main(String[] args) {
		
		detail(new BankAccount("Nanu",40000));
		BankAccount dt = new BankAccount("Garib Monu",10);
		
	}
	public static void detail(BankAccount info) {
		
		System.out.println(info.accHolder);
		System.out.println(info.deposit);
		
	}
}