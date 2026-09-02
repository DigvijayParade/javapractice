package collection_framworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class VK {

	String name ;
	int id ;
	
	public VK(String name ,int id) {
		
		this.name = name ;
		this.id = id ;
		
	}
	public static void main(String[] args) {
		
		ArrayList <VK> link = new ArrayList<>();
		
		link.add(new VK("nanu",12));
		link.add(new VK("Gannu",154));
		
		
		
		try {
		link.remove(1);
		
	}catch(Exception e) {
		
		System.out.println(e.getMessage());
	}
		System.out.println(link);
	}
		
		
	@Override
	public String toString() {
		return "VK [name=" + name + ", id=" + id + "]";
	}
	
	
}
