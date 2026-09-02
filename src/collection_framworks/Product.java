package collection_framworks;

import java.util.ArrayList;

import java.util.List;

public class Product {

	String name ;
	int pId ;
	
	public Product(String name,int pId) {
		
		this.name = name ;
		this.pId = pId ;
	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Samsung",101);
		Product p2 = new Product("Apple",102);
		Product p3 = new Product("Resmi",103);
		
		ArrayList <Product> pdList = new ArrayList <>(List.of(p1,p2,p3));
		
		for (Product p : pdList) {
			
			System.out.println(p);
		}
		
		pdList.remove(0);
		System.out.println(pdList);
	}
	
	@Override
	public String toString() {
		
		return "Product Name : "+name+"||"+"Product Id : "+pId ;
	}
}
