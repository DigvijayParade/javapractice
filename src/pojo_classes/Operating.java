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
	
		Operating obj = new Operating();
		Library l = new Library();
		String some = obj.removeBook.operation(l);
		System.out.println(some);
	}
}
