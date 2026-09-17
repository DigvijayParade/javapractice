package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookAnalyze {

	public static void main(String[] args) {

		BookAnalyze obj = new BookAnalyze();
		ArrayList<BookData> bookList = obj.getBookData();

		List<String> authors = bookList.stream()
		        .filter(e -> e.getPrice() > 400)
		        .map(e -> e.getAuthor())
		        .collect(Collectors.toList());
		
		int i = 0;
		for(String a : authors) {
			
			i++ ;
			System.out.println("Author"+ i +":"+a);
		}
	}

	public ArrayList<BookData> getBookData() {
		return new ArrayList<>(List.of(
			new BookData("Clean Code", "Robert C. Martin", 450.00, 464),
			new BookData("The Pragmatic Programmer", "Andrew Hunt", 550.00, 352),
			new BookData("Java: The Complete Reference", "Herbert Schildt", 650.00, 1248),
			new BookData("Head First Java", "Kathy Sierra", 400.00, 720),
			new BookData("Effective Java", "Joshua Bloch", 480.00, 416)
		));
	}
}