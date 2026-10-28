package optional_Class;

import java.util.Optional;

public class Executer {

	public static void main(String[] args) {
		
		Users u1 = new Users(new Addresss("Barshi"));
		Users u2 = new Users(null);
		Users u3 = null ;
		
		getCity(u1);
		getCity(u2);
		getCity(u3);
	}
	
	public static void getCity(Users u) {
		
		String city = Optional.ofNullable(u)
						.map(Users::getAddress)
						.map(Addresss::getCity)
						.orElse("Invalid");
						
		System.out.println(city);
	}
}

