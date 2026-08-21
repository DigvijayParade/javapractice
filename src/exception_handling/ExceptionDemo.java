package exception_handling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String [] std = {"nanu","Gannu","Sonu"};
		try {
			
			System.out.println(std[4]);
		}
		catch(Exception e) {
			
			System.out.println("Something wrong");
		}
		
//		catch(ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("Student your trying to access doesnt exist");
//		}
		
		finally{
			
			System.out.println("yeah so this is the basically exception handling");
		}
	}
}
