package stream_api;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreEmp {

	public static void main(String[] args) {
		
		
	}
	
	public ArrayList<Employee> getEmp(Scanner sc){
		
		ArrayList <Employee> empInfo = new ArrayList<>();
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter How many Employee : ");
		int empNum = sc.nextInt();
		
		for (int i = 1 ; i <= empNum ; i++) {
			
			System.out.println("Enter details for Employee : "+ i);
			
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
