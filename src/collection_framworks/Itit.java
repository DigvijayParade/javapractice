package collection_framworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itit {

	public static void main(String[] args) {
		
		ArrayList <Integer> list1 = new ArrayList<>(List.of(1,2,3,69,4));
		
		System.out.println(list1);
		Iterator <Integer> it = list1.iterator();
		
		while(it.hasNext()) {
			
			Integer a = it.next();
			if(a.equals(69)) {
				
				it.remove();
			}
		}
		
		System.out.println(list1);
	}
	
}
