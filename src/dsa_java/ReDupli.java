package dsa_java;

import java.util.Arrays;

public class ReDupli {

	public static void main(String[] args) {
		
		int [] arr = {1,3,4,5,6,1};
		int [] arr1 = new int[6];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr1[i] = arr[i];
			
			for(int j = i +1  ; i < arr.length ; j++) {
				
				if(arr[i] == arr1[j]) {
					
					System.out.println("Duplicate : "+arr1[i]);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
		
	}
}
