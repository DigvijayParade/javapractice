package collection_framworks ;

import java.util.*;

public class MapDem{
	
	public static void main(String[] args) {
		
		Map <String,ArrayList> classRoom = new HashMap<>();
		
		classRoom.put("Class10th", new ArrayList(List.of("Nanu","Sonu","Gannu","Monu")));
		classRoom.put("Class12th", new ArrayList(List.of("Sonty","Bobey","Balley")));
		
		System.out.println(classRoom.get("Class10th"));
		System.out.println(classRoom.get("Class12th"));
		
	}
}