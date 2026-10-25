package optional_Class ;

import java.util.Optional;

public class Main{
	
	public static void printCity(User u) {
		
		String city = Optional.ofNullable(u)
						.map(User::getAddress)
						.map(Address::getCity)
						.map(String::toUpperCase)
						.orElse("Invalid Input");
		
		System.out.println(city);
	}
	
	public static void printPenName(Book b) {
		
		String penname = Optional.ofNullable(b)
						.map(Book::getAuthor)
						.map(Author::getPenName)
						.map(String::toUpperCase)
						.orElse("Invalid Input");
		
		System.out.println(penname);
	}
	
	public static void main(String[] args) {
		
		Author a = new Author();
		
		Book b = new Book(a);
		printPenName(b);
		
		System.out.println("//////////////////////");
		
		Address  ad= new Address();
		User u = new User(ad);
		
		
		printCity(u);
	}
	
	
}