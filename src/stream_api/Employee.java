package stream_api;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int experienceYears;
    private List<String> skills;

    public Employee(int id, String name, String department, double salary, int experienceYears, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experienceYears = experienceYears;
        this.skills = skills;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getExperienceYears() { return experienceYears; }
    public List<String> getSkills() { return skills; }

    @Override
    public String toString() {
        return name + " (" + department + ", ₹" + salary + ", " + experienceYears + "y)";
    }
}