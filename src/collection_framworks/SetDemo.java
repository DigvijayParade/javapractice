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
		
		System.out.println(setOfId.getClass());
		
		LinkedList <Integer> setOfId2 = new LinkedList<>(List.of(8,85,9,42,30));
		
		System.out.println(setOfId.addAll(setOfId2));
		
		System.out.println(setOfId);
	}
}
