package collection_framworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDe {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList<>(List.of("Nanu","Sonu","Monu","Gannu","Sonu","Monu"));
		
		System.out.println("Size of ArraList : "+names.size());
		for(String n : names) {
			
			System.out.println(n);
		}
		
		System.out.println("ArraList to HashSet : ");
		Set <String> name = new HashSet<>(names);
		
		System.out.println("Size of the Aset : "+name.size());
		System.out.println(name);
		
		System.out.println("Converting to the tree Set : ");
		Set <String > nav = new TreeSet<>(names);
		
		System.out.println("Size of the Tree Set : "+nav.size());
		
		System.out.println(nav);
		
		System.out.println("Converting to the LinkedHashSet : ");
		
		Set <String> namvay = new LinkedHashSet <>(names);
		
		System.out.println("Size of The LinkedHashSet : "+namvay.size());
		System.out.println(namvay);
	}
}
