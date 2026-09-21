import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String text = "apple  banana  cherry";
		String[] fruits = text.split("\\s+");
		
		System.out.println(Arrays.toString(fruits) );
	}

}
