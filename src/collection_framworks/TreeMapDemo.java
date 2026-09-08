package collection_framworks;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap <Integer,String> nwList = new TreeMap<>(Map.of(1,"Nanu",2,"Sonu",3,"what",4,"not",5,"keys",6,"values",7,"substance",8,"random bs go",9,"idk",10,"java"));
		
		for(Map.Entry <Integer, String> e : nwList.entrySet()) {
			
			System.out.println(e.getKey()+" = "+ e.getValue());
			
		}
		System.out.println(nwList);
	}
}
