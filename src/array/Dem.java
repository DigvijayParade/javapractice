package array;
import java.util.Arrays;
public class Dem {

	int id;
	String name;
	
	public static void main(String[] args) {
		
		Dem [] detail = new Dem[5];
		
		detail[0] = new Dem();
		Dem d = detail[0];
		
		System.out.println(d.name = "nanu");
		System.out.println(d.id = 90);
		
		System.out.println(Arrays.toString(detail));
	}
}
