package array;

import java.util.*;

public class Arr{
	
	String name ;
	int id ;
	double price ;
	public Arr(String name ,
	int id ,
	double price ) {
		
		this. name = name;
		this. id = id ;
		this. price  = price;
	}
	public static void main(String[] args) {
		
		Arr[] detail = new Arr[5];
		detail[0] = new Arr("Iphone",38,75000.00);
		
		System.out.println(detail[0]);
		detail[1]=show(new Arr("Samsung",97,40000.00));
		show(detail[0]);
		
		ArrayList <Arr> data = new ArrayList<> ();
		data.add(show(new Arr("Xiaomi",69,20000.00)));
		data.add(show(new Arr("Samsung",97,40000.00)));
		for(Arr values : data) {
			
			System.out.println(values);
		}
		for(int i = 0 ; i < data.size() ;i++) {
			
			if (data.get(i).name.equals("Xiaomi")) {
		        
		        System.out.println("Match found at index " + i + ":");
		        System.out.println(data.get(i).name);
		        System.out.println(data.get(i).id);
		        System.out.println(data.get(i).price);
			}
			
		}
		for (int i = 0 ;i < detail.length;i++) {
			
			Arr target = new Arr("Samsung",97,40000.00) ;
			if (target.equals(detail[i])) {
				
				System.out.println(i);
			}
		}
		
	}
	public static Arr show(Arr product) {
		
		System.out.println(product.name);
		System.out.println(product.id);
		System.out.println(product.price);
		
		return product;
	}
}