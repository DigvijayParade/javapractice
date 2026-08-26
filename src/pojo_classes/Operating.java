package pojo_classes;

public class Operating {

	Operations addBook = e -> {
		
		e.setName("Ikigai");
		e.setPrice(4455.00);
		e.setBookid(101);
		return "Book "+e.getName()+" Added" ;
	};
	
	Operations removeBook = e ->{
		
		e.setName(null);
		e.setPrice(0);
		e.setBookid(0);
		
		return "Removed "+e.getName() ;
	};
	
	public static void main(String[] args) {
		
		Library e = new Library();
		String res = addBook.operation(e);
	}
}
