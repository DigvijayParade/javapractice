package inheritance;

import java.util.*;

public class Choosepaymethod {

	public static void main(String[] args) {
		
		Allpayments c1 = new Allpayments("Nanu",101);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1. for netbanking :");
		System.out.println("press 2. for debitcard :");
		System.out.println("press 3. for creditcard :");
		System.out.println("press 4. for upi :");
		
		int method = sc.nextInt();
		if(method == 1) {
			
			 c1.netbank(500);
		}
		else if(method == 2) {
			
			c1.debitcard(500);
		}
		else if(method == 3) {
			
			c1.creditcard(500);
		}
		else if(method == 4) {
			
			c1.upi(500);
		}
	}
}
