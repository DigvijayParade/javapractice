package stream_api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum Department {
    DEV, HR, SALES
}

class Employe {
    private int id;
    private String name;
    private Department department;
    private double salary;
    private String city;

    public Employe(int id, String name, Department department, double salary, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city = city;
    }

    public Department getDepartment() { return department; }
    public String getCity() { return city; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + city + ", $" + salary + ")";
    }
}

public class ScenarioPractice {
    public static void main(String[] args) {
        List<Employe> employees = List.of(
            new Employe(1, "Alice", Department.DEV, 85000, "New York"),
            new Employe(2, "Bob", Department.HR, 50000, "Los Angeles"),
            new Employe(3, "Charlie", Department.DEV, 95000, "New York"),
            new Employe(4, "David", Department.SALES, 60000, "Chicago"),
            new Employe(5, "Eve", Department.HR, 55000, "Los Angeles"),
            new Employe(6, "Frank", Department.DEV, 110000, "Chicago")
        );

        Map<Department, List<Employe>> deptMap = employees.stream()
										        .filter(e -> e != null )
										        .collect(Collectors.groupingBy(e -> e.getDepartment()));
       
       System.out.println(deptMap);
       
       Map<String, List<Employe>> cityEmp = employees.stream()
		        .filter(e -> e != null )
		        .collect(Collectors.groupingBy(e -> e.getCity()));
       
       System.out.println(cityEmp);
    }
}