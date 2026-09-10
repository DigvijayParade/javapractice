package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StreamDemo obj = new StreamDemo();
		
		System.out.println(obj.getAllEmp(sc));
		
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
