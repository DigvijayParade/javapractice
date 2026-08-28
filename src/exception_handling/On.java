package exception_handling;

public class On {

	public static void main(String[] args) {
		
		try {
		
			String sentence = "this will be risky code block";
			
			System.out.println(sentence.toUpperCase());
		}
		catch(Exception e) {
			
			System.out.println("Reason of the error : "+e.getMessage());
			System.out.println("this will catch the exception");
		}
		
		finally{
			
			System.out.println("this will br executed no matter what !!");
		}
	}
}
