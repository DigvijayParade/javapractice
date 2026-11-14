package stream_api;

import java.util.*;
import java.util.stream.*;

public class StreamEngine {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Aarav",  "Engineering", 95000,  6, List.of("Java", "Spring", "Docker")),
            new Employee(2, "Sneha",  "Engineering", 115000, 8, List.of("Java", "Kubernetes", "AWS")),
            new Employee(3, "Rohan",  "Product",     70000,  3, List.of("Figma", "SQL", "Agile")),
            new Employee(4, "Kabir",  "Engineering", 65000,  2, List.of("Java", "SQL", "Git")),
            new Employee(5, "Meera",  "HR",          60000,  5, List.of("Recruiting", "Communication", "Excel")),
            new Employee(6, "Vikram", "Product",     90000,  7, List.of("Strategy", "SQL", "Agile")),
            new Employee(7, "Ananya", "Engineering", 105000, 5, List.of("Python", "AWS", "Docker"))
        );

        List<String> EngRich = employees.stream()
        						.filter(e -> e != null && e.getSkills() != null)
        						.filter(e -> e.getDepartment().equalsIgnoreCase("Engineering")&& e.getSalary() >80000.00)
        						.map(e -> e.getName())
        						.toList();
        
        EngRich.forEach(System.out::println);
        
        System.out.println("2nd///////////////");
       List<Employee> highestPaidMf = employees.stream()
    		   						.filter(e -> e != null && e.getSkills() != null)
    		   						.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
									.limit(3)
									.toList();
       
       highestPaidMf.forEach(System.out::println);
       
       System.out.println("3rd//////////////////////");
       
       double totalEng = employees.stream()
					.filter(e -> e != null && e.getSkills() != null)
					.filter( e-> e.getDepartment().equalsIgnoreCase("Engineering"))
					.mapToDouble(e -> e.getSalary())
					.sum();
       System.out.println(totalEng);
       
       System.out.println("4th///////////////////////");
       
       List<String> uqSkills = employees.stream()
    		   					.filter(e -> e != null && e.getSkills() != null)
    		   					.flatMap(e -> e.getSkills().stream())
    		   					.distinct()
    		   					.toList();
       
       System.out.println(uqSkills);
       
       System.out.println("5th////////////////////////////");
       
       Map<String,Double> AvgDep =  employees.stream()
									.filter(e -> e != null && e.getSkills() != null)
									.collect(Collectors.groupingBy(Employee::getDepartment))
									.av
    		   					
    		   					
    		   								
        
        						
        
    }
}