package inheritance;

import java.util.*;

//Net banking

class NetBank{
	
	String userName;
	int userId;
	//Netbak class constructor
	public NetBank(String userName,
	int userId){
		
		this.userId = userId;
		this.userName = userName;
	}
	public void pay(int payAmount) {
		
		System.out.println(this.userName + " paid: $" + payAmount);
	}
	void main() {
		
		Scanner sc = new Scanner(System.in);
		NetBank [] customers = new NetBank[3];
		
		for (int i = 0 ; i< customers.length;i++) {
			
			System.out.println("Enter user name for "+ +i);
			String name = sc.nextLine();
			
			System.out.println("Enter user Id");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			customers[i] = new NetBank(name,id);
		}
		
		for(NetBank c : customers) {
			
			c.pay(500);
		}
		
	}
	
}
public class Payment extends NetBank{
	
	public Payment(String userName,
			int userId){
				
				super(userName,userId);
			}
	public static void main(String[]args) {
		
//		Payment obj = new Payment();
	
	}
	

}
