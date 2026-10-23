package optional_Class;

import java.util.Optional;

public class Ok {

	public static Optional<String> m1(String n){
		
		return Optional.ofNullable(n)
                .map(String::toUpperCase);
	}
	public static void main(String[] args) {
		
		System.out.println(m1(null));
	}
}
