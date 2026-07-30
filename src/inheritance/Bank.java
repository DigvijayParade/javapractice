package inheritance;

interface NetBank{
	
	default void what() {
		
		System.out.println("its an default method of a netbank we can override it or use it as it is");
	}
	public void pay();
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

public class Bank extends Credit implements NetBank{
	
	public Bank(String username,int id) {
		
		super(username,id);
	}
	public static void main(String[] args) {
		Bank c1 = new Bank("nanu"):
	}
	
	@Override
	public void pay(int value) {
		
		System.out.println(username+" "+"deposited"+" "+value+" "+"through netbanking");
	}
}
