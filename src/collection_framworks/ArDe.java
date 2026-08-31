package collection_framworks;

import java.util.ArrayList;

public class ArDe {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
	
		ArDe obj = new ArDe();
		
		arr.add("Nanu");
		arr.add(obj);
		arr.add(arr);
		
//		System.out.println(arr);
		
		for (Object n : arr) {
			
			System.out.println(n);
		}
	
	}
	
	@Override
	public String toString() {
		
		return "Return Array : ";
	}
}
