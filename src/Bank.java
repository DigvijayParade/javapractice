
public class Bank {

	static String bankName;
	static double intrRate;
	static {
		
		bankName = "SBI";
		
		System.out.println(bankName);
	}
	static {
		
		intrRate = 4.5;
	}
	
	String userName ;
	double deposit;
	{
		
		System.out.println("New account created");
		
	}
	public Bank(String userName ,double deposit) {
		
		this.deposit = deposit;
		this.userName = userName;
		System.out.println(userName+" "+"created an account");
		System.out.println(userName+" "+"deposited"+" "+deposit);
		
		
	}
	public static void main(String[] args) {
		
		Bank c1 = new Bank("Vijay Yadav",10.00);
		
		details(c1);
		
		Bank [] customers = new Bank[5];
		customers[0] = new Bank("Nanu",100000.0);
		customers[1] = new Bank("Monu",10.0);
		customers[2] = new Bank("Sonu",8000.0);
		customers[3] = new Bank("DD",89000.0);
		customers[4] = new Bank("Ganu",50.0);
		
		
		int i = 0;
		for (Bank detail : customers) {
			
			details(detail); // Reusing your helper method!
           
		}
	}
	public static void details(Bank data) {
		
		System.out.println(data.userName);
		System.out.println(data.deposit);
	}
	
}
