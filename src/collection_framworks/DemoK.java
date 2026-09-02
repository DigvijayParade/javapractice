package collection_framworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoK {

	public static void main(String[] args) {
		
	ArrayList <Integer> list = new ArrayList<>();
	
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
	
		System.out.println(list);
		System.out.println(list.get(0) + list.get(3));
		
		list.add(5,9000);
		System.out.println(list);
		
		LinkedList <String>link = new LinkedList<>();
		
		link.add("Nanu");
		link.add("Sonu");
		link.add("Ganu");
		link.add("Monu");
		link.add("Tenu");
		
		System.out.println(link);
		System.out.println(link.get(0) + link.get(4));
		
		
	} 
}
