package collection_framworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddDemo {

	public static void main(String[] args) {
		
		ArrayList <String> arrStr = new ArrayList <>();
		
		arrStr.add("Nanu");
		arrStr.add("Monu");
		
		LinkedList <Object> arrLink = new LinkedList<>();
		
		arrLink.add(101);
		arrLink.add(102);
		
		arrLink.addAll(1,arrStr);
		
		System.out.println(arrLink);
	}
}
