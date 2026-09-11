package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StreamDemo obj = new StreamDemo();
		
		ArrayList<Employee> empData = obj.getAllEmp(sc);
		
		Stream <Employee> dataStream =  empData.stream();
		
		Predicate <Employee> m1 = (e) -> e.getEmpSalary() >= 50000.00;
		dataStream.filter(m1)
        .forEach(e -> System.out.println(e.getName() + " : " + e.getEmpSalary()));
	}
	
	public ArrayList <Employee> getAllEmp(Scanner sc){
		
		ArrayList <Employee> empInfo = new ArrayList <>();
		
		System.out.println("How many emp ?");
		
		int numEmp = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1 ; i <= numEmp; i++) {
			
			System.out.println("Enter Details of Employee "+i+" "+" : ");
			
			System.out.println("Enter Name : ");
			String empName = sc.nextLine();
			
			System.out.println("Enter Id : ");
			int empId = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Age : ");
			int empAge = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Salary : ");
			double empSalary = Double.parseDouble(sc.nextLine());
			
			empInfo.add(new Employee(empName,empId,empAge,empSalary));
		}

		return empInfo ;
	}
}
