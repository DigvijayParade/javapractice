package optional_Class;

public class Demo {

	public static void main(String[] args) {
		
		Demo d = null ;
		
		try {
		d.getClass();
		}
		catch(NullPointerException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
