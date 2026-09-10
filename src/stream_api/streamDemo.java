package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class streamDemo {

	public static void main(String[] args) {
		
		
		
		
	}
	
	public ArrayList <Employee> getAllEmp(Scanner sc){
		
		ArrayList <Employee> empInfo = new ArrayList <>();
		
		System.out.println("How many emp ?");
		
		int numEmp = sc.nextInt();
		sc.next();
		
		for (int i = 1 ; i < numEmp; i++) {
			
			System.out.println("Enter Name : ");
			String empName = sc.nextLine();
			
			System.out.println("Enter Id : ");
			int empId = sc.nextInt();
			
			System.out.println("Enter ");
		}

		return empInfo ;
	}
}
