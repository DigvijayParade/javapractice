package collection_framworks;

import java.util.Map;
import java.util.TreeMap;

public class PrintItOut {

	public static void main(String[] args) {
		
		TreeMap <Integer,String> some = new TreeMap<>(Map.of(10,"Nanu",1,"Gyat"));
		
		for (Map.Entry<Integer, String> k : some.sequencedEntrySet()) {
			
//			System.out.println(k.getValue());
//			System.out.println(k.getKey());
			System.out.println(k.getKey()+"="+k.getValue());
		}
		
		some.remove(10);
		System.out.println(some);
	}
}
