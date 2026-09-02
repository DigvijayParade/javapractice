package collection_framworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDemo {

	public static void main(String[] args) {
		
		ArrayList <String> arr1 = new ArrayList<>();
		
		arr1.add("Nanu");
		arr1.add("Sonu");
		arr1.add("Monu");
		arr1.add("Ganu");
		arr1.add("Tenu");
		
		LinkedList <String> link1 = new LinkedList<>();
		
		link1.add("Sonu");
		link1.add("Monu");
		link1.add("John");
		link1.add("Mia");
		link1.add("Swara");
		
		System.out.println(arr1);
		System.out.println(link1);
		
		System.out.println("////////////////////");
		System.out.println(arr1.addAll(3,link1));
		System.out.println(arr1);
		
		System.out.println("//////////////////////");
		System.out.println(arr1.removeAll(link1));
		System.out.println(arr1);
		
		System.out.println("/////////");
		
		System.out.println(arr1.contains("Mia"));
	}
}
