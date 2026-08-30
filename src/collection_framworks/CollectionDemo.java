package collection_framworks;

import java.util.ArrayList;

public class CollectionDemo {

	String itemName ;
	int itemId ;
	
	public CollectionDemo(String itemName ,int itemId ) {
		
		this.itemName = itemName ;
		this.itemId = itemId ;
	}
	public static void main(String[] args) {
		
		ArrayList  names = new ArrayList();
		ArrayList <CollectionDemo> list = new ArrayList <>();
		
		list.add(new CollectionDemo("WristBsnd",101));
		list.add(new CollectionDemo("Car",102));
		System.out.println(list.get(1));
		
		names.add("Hwlo");
		names.add(101);
		for (CollectionDemo o : list) {
			
			System.out.println(names);
			o.printInfo();
		}
	}
	
	void printInfo() {
		
		System.out.println("Item Name : "+this.itemName);
		System.out.println("item Id : "+this.itemId);
	}
	
	@Override
	public String toString() {
		return "Name : "+itemName+", id : "+itemId;
		
	}
}
