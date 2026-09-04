package collection_framworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Fruits {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");       // Index 0
        fruits.add("Banana");      // Index 1
        fruits.add("Cherry");      // Index 2
        fruits.add("Date");        // Index 3
        fruits.add("Elderberry");  // Index 4

        System.out.println("Before Insertion:");
        System.out.println(fruits);
        System.out.println("Size: " + fruits.size());

        fruits.add(2, "Mango");

        System.out.println("\nAfter Insertion at Index 2:");
        System.out.println(fruits);
        System.out.println("Size: " + fruits.size());
        
        Fruits basket = new Fruits ();
        basket.RemoveSome(fruits,"Lion");
        
        System.out.println(fruits);
    }
    
    void RemoveSome(List <String> list,String item) {
    	
    		Iterator <String> it = list.iterator();
    		
    		boolean found = false ;
    		while(it.hasNext()) {
    			
    			if(it.next().equalsIgnoreCase(item)) {
    				found = true ;
    			it.remove();
    			}
    		}
    		
    		if (found) {
    	        System.out.println(item + " Removed");
    	    } else {
    	        System.out.println(item + " Not Found");
    	    }
    }
}