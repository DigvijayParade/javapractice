package collection_framworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArDe {

	public static void main(String[] args) {
		
		ArrayList <Integer >arr = new ArrayList <>();
		arr.add(101);
		arr.add(103);
		arr.add(104);
		arr.add(105);
		arr.add(106);
		arr.add(101);
		
		Iterator <Integer> it = arr.iterator();
		
		while(it.hasNext()) {
			
			Integer sum = it.next();
			
			if(sum.equals(101)) {
				
				it.remove();
			}
		}
		
		System.out.println(arr);
	
		
	
	}
	
	@Override
	public String toString() {
		
		return "Return Array : ";
	}
}
