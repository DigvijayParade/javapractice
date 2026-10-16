package array;

import java.util.*;

public class ArrayOfobj {
	
	String name;
	int id;
	double price;
	public ArrayOfobj(String name,
	int id,
	double price) {
		
		this.id =  id;
		this.price = price;
		this.name = name;
		
	}
	public static void main(String[] args) {
		
		normArray();
		arrayList();
		
	}
	public static void normArray() {
		
		ArrayOfobj [] prDetails = new ArrayOfobj[5];
		
		prDetails[4]= new ArrayOfobj("iphone",7845,100000.85);
		prDetails[3]= new ArrayOfobj("iphone 17",7890,100800.85);
		
		obj(prDetails[3]);
		obj(prDetails[4]);
		
		
	}
	public static void arrayList() {
		
		ArrayList <ArrayOfobj> prdDetails = new ArrayList <> ();
		
		prdDetails.add(new ArrayOfobj("Samsung s20",90,80000.00));
		prdDetails.add(new ArrayOfobj("Xioami",876,90367));
		
		obj(prdDetails.get(0));
		obj(prdDetails.get(1));
		
	}
	public static void obj(ArrayOfobj product) {
		
		System.out.println(product.name);
		System.out.println(product.id);
		System.out.println(product.price);
		
	}

}
