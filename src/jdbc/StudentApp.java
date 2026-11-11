package jdbc ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentApp{
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("welcome Bro !!");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			
			
			
			System.out.println("1 to add");
			System.out.println("2 to delete");
			System.out.println("3 to display");
			System.out.println("4 to exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				
				System.out.println("Enter Name : ");
				String name = br.readLine();
				System.out.println("Enter Phone : ");
				String phone = br.readLine();
				System.out.println("Enter City : ");
				String city = br.readLine();
				
				Student s = new Student(name,phone,city);
				
			}else if(c == 2) {
				
				
			}else if(c == 3) {
				
				
			}
			else if(c == 4){
				
				break ;
			}
			
		}
		System.out.println("See u !!");
	}
}