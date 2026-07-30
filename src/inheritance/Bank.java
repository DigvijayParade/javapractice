package inheritance;

interface Netbank{
	
	default void what() {
		
		System.out.println("its an default method of a netbank we can override it or use it as it is");
	}
	public void pay(int value);
}
class Credit{
	
	String username;
	int id;
	Credit(String username,int id){
		
		this.id = id;
		this.username = username;
	}
	public void pay(int amount) {
		
		System.out.println(username+" "+"deposited"+" "+amount+" "+"through creditcard");
	}
}

public class Bank extends Credit implements Netbank{
	
	public Bank(String username,int id) {
		
		super(username,id);
	}
	public static void main(String[] args) {
		Bank c1 = new Bank("nanu",101);
		c1.pay(100);
		c1.what();
	}
	
	@Override
	public void pay(int value) {
		
		System.out.println(username+" "+"deposited"+" "+value+" "+"through netbanking");
	}
}
