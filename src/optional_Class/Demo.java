package optional_Class;

public class Demo {

	public static void main(String[] args) {
		
		Author a1 = new Author("J. D. VANCE");
		Author a2 = new Author();
		
		Book b1 = new Book(a1);
		Book b2 = new Book(a2);
		
		System.out.println(a1.getPenName());
		System.out.println(a2.getPenName());
		
	}
}
