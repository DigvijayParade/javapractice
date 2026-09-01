package collection_framworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedLDemo {

	public static void main(String[] args) {
		
		List <String> list = new LinkedList <>();
		
		list.add("Nanu");
		list.add("Sonu");
		list.add("Monu");
		list.add("Ganu");
		list.add("Nanu");
		Set<String> seen = new HashSet<>();
	
	Iterator <String> it = list.iterator();
	
	String name = it.next();
	if (!seen.add(name)) {
        System.out.println("Duplicate removed: " + name);
        it.remove();
		}
	
		
	
	
	System.out.println(list);
	}
}
	

