package commandlineargs;

import java.util.Arrays;

public class Cmd {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));
		
		System.out.println(args[1]);
		int[] numbers = new int[4];
		numbers[0] = Integer.parseInt(args[0]);
		numbers[1] = Integer.parseInt(args[1]);
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		int c = numbers[0] + numbers[1];
		
		System.out.println(c);
		
		Cmd [] k = meth();
		k[0] = new Cmd();
		
		
	}
	//this returns array of objets
	public static Cmd[] meth() {
		
		Cmd [] obj = new Cmd[5];
		
		return obj;
	}
//	this returns single object
public static Cmd zeth() {
		
		Cmd obj = new Cmd();
		
		return obj;
	}
	
	
}
