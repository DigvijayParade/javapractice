package array;

import java.util.*;

public class Methodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] nav = names();
		for(int i = 0 ; i< nav.length ; i++) {
			
			nav[i] = sc.nextLine();
		}
		for(String n : nav) {
			
			System.out.println(n);
		}
		for(int i = nav.length-1; i >= 0 ;i--) {
			
			System.out.println(nav[i]);
		}

	}
	public static String[] names() {
		
		String[] name = new String[5];
		
		return name;
	}

}
