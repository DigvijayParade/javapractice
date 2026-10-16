package array;

import java.util.Scanner;

import java.util.Arrays;

public class ArrayFind{
	
	
	public static void main(String[]atg) {
		
		int [] ar = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < ar.length; i++) {
			
			ar[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		
		System.out.println("Enter Target : ");
		int target = sc.nextInt();
		
		boolean found = false;
		
		for(int i = 0 ; i < ar.length ;i ++) {
			
			if (ar[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
			}
		}
        if (!found) {
            System.out.println("No matching number");
        }
	}
}