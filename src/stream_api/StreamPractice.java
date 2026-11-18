package stream_api ;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {
	
    public static List<Emp> employees = Arrays.asList(
    		
        new Emp(1, "Alice", "IT", 75000.0, true),
        new Emp(2, "Bob", "HR", 45000.0, true),
        new Emp(3, "Charlie", "IT", 95000.0, false),
        new Emp(4, "Diana", "Finance", 60000.0, true),
        new Emp(5, "Ethan", "HR", 50000.0, false)
        
    );

    public static void main(String[] args) {
       
    	boolean hasHighEarner = employees.stream()
    							.anyMatch(e -> e.getSalary() > 90000.00);
    							
    	boolean areAllActive = employees.stream()
    							.allMatch(Emp::isActive);
    	
    	
    	
    	System.out.println(hasHighEarner);
    	System.out.println(areAllActive);
    }
}