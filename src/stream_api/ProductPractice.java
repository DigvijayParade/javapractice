package stream_api ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProductPractice {
    public static List<Products> products = Arrays.asList(
        new Products(101, "Laptop", "Electronics", 1200.0, true),
        new Products(102, "Phone", "Electronics", 800.0, true),
        new Products(103, "Mouse", "Accessories", 25.0, false),
        new Products(104, "Keyboard", "Accessories", 45.0, true),
        new Products(105, "Monitor", "Electronics", 300.0, false)
    );

    public static void main(String[] args) {
        
    	boolean hasPremiumProduct = products.stream()
    									.anyMatch(p -> p.getPrice() > 1000);
    	
    	boolean allAvailable = products.stream()
    							.allMatch(Products::isInStock);
    	
    	boolean noCheapItems = products.stream()
    							.noneMatch(p -> p.getPrice() < 10);
    	
    	Optional<Products> firstAccessory = products.stream()
    										.filter(p -> p.getCategory().equalsIgnoreCase("Accessories"))
    										.findFirst();
    	
    	Optional<Products> anyOutOfStock = products.stream()
    										.filter(p -> p.isInStock() == true)
    										.findAny();
    	
    	long c =products.stream()
    			.filter(p -> p.getCategory().equalsIgnoreCase("Electronics"))
    			.count() ;
    	
    	Optional<Products> max = products.stream()
    				.max(Comparator.comparing(Products::getPrice));
    	
    	Optional<Products> min = products.stream()
    								.min(Comparator.comparing(Products::getPrice));
    	
    	System.out.println(hasPremiumProduct);
    	System.out.println(allAvailable);
    	System.out.println(noCheapItems);
    	System.out.println(firstAccessory.get());
    	System.out.println(anyOutOfStock.get());
    	System.out.println(c);
    	
    	System.out.println(max.get());
    	System.out.println(min.get());
    }
}