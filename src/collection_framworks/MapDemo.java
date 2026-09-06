package collection_framworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer,List<String >> stdInfo = new HashMap <>();
		
		System.out.println(stdInfo.size());
		stdInfo.put(1,new ArrayList<>());
		stdInfo.get(1).addAll(List.of("nanu","sonu"));
		
		stdInfo.put(2, new ArrayList<>(List.of("Abe bolna ","Kya hui hawa nikal gai")));
		
		System.out.println(stdInfo.get(1));
		System.out.println(stdInfo.get(2));
		
		
	}
}
