package collection_framworks ;

import java.util.*;

public class MapDem{
	
	public static void main(String[] args) {
		
		Map <String,ArrayList> classRoom = new HashMap<>();
		
		classRoom.put("Class10th", new ArrayList(List.of("Nanu","Sonu","Gannu","Monu")));
		classRoom.put("Class12th", new ArrayList(List.of("Sonty","Bobey","Balley")));
		
		System.out.println(classRoom.get("Class10th"));
		System.out.println(classRoom.get("Class12th"));
		
		System.out.println("2 years have passed now 10th student r in the 12th...........");
		
		classRoom.get("Class12th").clear();
		System.out.println(classRoom.get("Class12th").add(List.of("Nanu","Sonu","Gannu","Monu")));
		
		System.out.println("New class of 12th : "+classRoom.get("Class12th"));
	}
}