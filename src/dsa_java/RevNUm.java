package dsa_java;

import java.util.Scanner;

public class RevNUm {

	public static void main(String[] args) {
		
		reverse(123);
		
		
	}
	public static void reverse(int num) {
		
		int og = num ;
		int rev = 0 ;
		
		while(num != 0) {
			
			int lastDG = num % 10 ;
			rev = (rev * 10) + lastDG ;
			num = num / 10 ;
			
		}
		
		System.out.println(rev);
	}
		
		
	
}
