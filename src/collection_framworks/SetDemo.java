package collection_framworks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {

	
	public static void main(String[] args) {
		
		Set <Integer> setOfId = new HashSet<>(Set.of(101,102,103,104));
		
		System.out.println(setOfId);
		
		System.out.println(setOfId.contains(101));
		
//		
//		LinkedList <Integer> setOfId = new LinkedList<>(List.of(101,101,102,103,104));
//		
//		System.out.println(setOfId);
	}
}
