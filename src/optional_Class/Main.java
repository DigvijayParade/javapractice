package optional_Class ;

import java.util.Optional;

public class Main{
	
	public static void main(String[] args) {
		
		Address a1 = new Address("barshi");
		
		User u1 = new User(a1);
		
		printUserCity(u1);
	}
	
	public static void printUserCity(User user) {
		
		String city = Optional.ofNullable(user).
				map(User::getAddress).map(Address::getCity).map(String::toUpperCase)
				.orElse("Unknown City");
				
		System.out.println(city);
	}
}