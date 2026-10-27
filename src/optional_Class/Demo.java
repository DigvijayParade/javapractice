package optional_Class;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
		Author a1 = new Author("J. D. VANCE");
		Author a2 = new Author();
		
		Book b1 = new Book(a1);
		Book b2 = new Book(a2);
		
	}
	public static void getPenname(Book b) {
		
		String penName = Optional.ofNullable(b)
						.map(Book::getAuthor)
						.map(Author::getPenName)
						.map(String::toUpperCase)
						.orElse("Invalid Input!!");
						
		
		
		System.out.println(penName);
	}
}
