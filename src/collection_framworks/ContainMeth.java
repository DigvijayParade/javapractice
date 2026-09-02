package collection_framworks;

import java.util.ArrayList;
import java.util.List;

public class ContainMeth {

	public static void main(String[] args) {
		
		ArrayList <String> og = new ArrayList<>();
		
		og.add("nanu");
		og.add("monu");
		og.add("ganu");
		og.add("sonu");
		og.add("mia");
		og.add("jhony");
		
		System.out.println(og);
		
		ArrayList <String> dp = new ArrayList<>();
		
		dp.add("mia");
		dp.add("jhony");
//		
//		System.out.println("Combinig both.........");
//		System.out.println(og.addAll(dp));
//		System.out.println(og);
//		
//		System.out.println("REMOving ......");
//		System.out.println(og.removeAll(dp));
//		System.out.println(og);
//		
//		System.out.println("/////////checking///////");
//		
//		System.out.println(og.contains("mia"));
		
//		System.out.println(og.retainAll(dp));
//		System.out.println(og);
		
		List<String> newList = og.subList(3, 4);
	System.out.println(newList);
	}
}
