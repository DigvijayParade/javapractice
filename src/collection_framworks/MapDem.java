package collection_framworks;

import java.util.HashMap;

public class MapDem {

	public static void main(String[] args) {
		
		HashMap <Integer,String> list = new HashMap <>();
		
		list.put(1, "nanu");
		list.put(2, "nanu");
		list.put(3, "nanu");
		list.put(4, "nanu");
//		list.put(1, "nanu");
		
		System.out.println(list.getOrDefault(6, "Tenud"));
	}
}
