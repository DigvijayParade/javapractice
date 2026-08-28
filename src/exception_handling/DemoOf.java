package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoOf {

	public static void main(String[] args) {
		
		try {
			
			String name = "Digvijay Parade";
			
			System.out.println(name.charAt(90));
		}
		
		catch(Exception e) {
			
			String reason = e.getMessage();
			System.out.println("Reason of the Exception : "+reason);
		}
		
		System.out.println("This was a Runtime time Exception mean unchecked");
		
			
			try {
				FileInputStream file = new FileInputStream("C:/info.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			System.out.println("THos was a CompileTime exception Also called the checked");

	}
}
