package array;

import java.util.*;
public class ArrayD {

	public static void main(String[]args) {
		
		ArrayD obj = new ArrayD();
		
		obj.fixAr().dynamicAr();
		
	}
	ArrayD fixAr() {
		
		Scanner sc = new Scanner(System.in);
		int [] fix = new int[5];
		
		for(int i = 0;i< fix.length ;i++) {
			
			fix[i] = sc.nextInt();
			
			System.out.println(fix[i]);
		}
		System.out.println(Arrays.toString(fix));
		
		return this;
	}
	ArrayD dynamicAr() {
		
		ArrayList <Integer> numbers = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		numbers.add(scan.nextInt());
		
		System.out.println(numbers);
		return this;
		
	}
}
