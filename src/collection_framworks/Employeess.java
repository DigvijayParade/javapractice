package collection_framworks;

import java.util.ArrayList ;
import java.util.List;

public class Employeess {

	String name ;
	int empId ;
	double salary ;
	int age ;
	String gender ;
	String depname ;
	String city ;
	
	public Employeess() {}
	public Employeess(String name, int empId, double salary, int age, String gender, String depname, String city) {
		
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.depname = depname;
		this.city = city;
	}
	
	public static void main(String[] args) {
		
		Employeess emp1 = new Employeess("Nanu", 101, 75000.0, 28, "Male", "IT", "Pune");
		Employeess emp2 = new Employeess("Sonu", 102, 62000.0, 32, "Male", "HR", "Mumbai");
		Employeess emp3 = new Employeess("Monu", 103, 85000.0, 29, "Male", "Finance", "Bangalore");
		Employeess emp4 = new Employeess("Mia", 104, 95000.0, 26, "Female", "IT", "Pune");
		Employeess emp5 = new Employeess("Swara", 105, 54000.0, 24, "Female", "Marketing", "Delhi");
		Employeess emp6 = new Employeess("John", 106, 71000.0, 35, "Male", "Sales", "Mumbai");
		Employeess emp7 = new Employeess("Ganu", 107, 48000.0, 23, "Male", "HR", "Pune");
		Employeess emp8 = new Employeess("Riya", 108, 88000.0, 31, "Female", "IT", "Bangalore");
		Employeess emp9 = new Employeess("Aman", 109, 67000.0, 30, "Male", "Finance", "Hyderabad");
		Employeess emp10 = new Employeess("Neha", 110, 92000.0, 27, "Female", "IT", "Pune");
		
		ArrayList <Employeess> empList = new ArrayList <>(List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10));
		
//		System.out.println("///// Details of All Employees /////////");
		
//		for (Employeess e : empList) {
//			
//			System.out.println(e);
//		}
		
		Employeess emp = new Employeess();
		
		emp.gethighestSalary(empList);
		emp.getLowestsalary(empList);
		emp.getCount(empList);
		emp.getEmpCountByDept(empList, "IT");
	
	}
	
	void gethighestSalary(ArrayList <Employeess> list) {
		
		if (list == null || list.isEmpty()) {
			
			return ;
		}
		
		Employeess higherSalary = list.get(0);
		
		for (Employeess e : list) {
			
			if (e.salary > higherSalary.salary) {
				
				 higherSalary = e ;
			}
		}
		
		System.out.println("Highest salary ....");
		System.out.println(higherSalary);
	}
	
	void getLowestsalary(ArrayList <Employeess> list) {
		
		if (list == null || list.isEmpty()) {
			
			return ;
		}
		
		Employeess lowestsalary = list.get(0);
		
		for (Employeess e : list) {
			
			if(e.salary < lowestsalary.salary) {
				
				lowestsalary = e ;
			}
		}
			
			System.out.println("Lowest salary ....");
			System.out.println(lowestsalary);
		
	}
	
	void getCount (ArrayList <Employeess> list){
		
		int maleCount = 0;
		int femaleCount = 0;
		for(Employeess e : list) {
			
			if(e.getGender().equalsIgnoreCase("Female") ){
				
				femaleCount ++;
			}
			else if(e.getGender().equalsIgnoreCase("Male")) {
				
				maleCount ++;
			}
		}
		
		System.out.println("Total Male Employee : "+maleCount);
		System.out.println("Total Female Employee : "+femaleCount);
	}
	
	void getEmpCountByDept(ArrayList<Employeess> list, String deptName) {
	    if (list == null || list.isEmpty()) return;

	    int count = 0;
	    for (Employeess e : list) {
	        if (e.getDepname().equalsIgnoreCase(deptName)) {
	            count++;
	        }
	    }
	    System.out.println("Total employees in " + deptName + ": " + count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employeess [name=" + name + ", empId=" + empId + ", salary=" + salary + ", age=" + age + ", gender="
				+ gender + ", depname=" + depname + ", city=" + city + "]";
	}
	
	
}
