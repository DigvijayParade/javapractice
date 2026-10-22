package cyber_success.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Random {

	public static void average(ArrayList<Integer> n) {
		
		double total = 0 ;
		for(int num : n) {
			
			total += num ;
		}
		
		double average = total/n.size();
		
		System.out.println(average);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<>();
		
		boolean still = true ;
		while(still) {
			
			System.out.println("Enter Number : ");
			num.add(sc.nextInt());
			System.out.println("type True to add more ,type false to stop");
			still = sc.nextBoolean();
		}
		
		average(num);
	}
}
