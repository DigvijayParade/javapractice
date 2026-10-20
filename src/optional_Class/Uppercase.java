package optional_Class;

import java.util.Optional;

public class Uppercase {

	public static void main(String[] args) {
		
		Optional<String> name = getName();
		
		String n = name.get().toUpperCase();
		
		System.out.println(n);
		
		
		
		System.out.println(name);
	}
	
	public static Optional<String> getName( ) {
		
		Optional<String> n = Optional.of("Nanu");
		return n ;
		}
}
