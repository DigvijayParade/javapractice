package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookAnalyze {

	public static void main(String[] args) {

		BookAnalyze obj = new BookAnalyze();
		ArrayList<BookData> bookList = obj.getBookData();

		Predicate<BookData> cheapBooks = b -> b.getPrice() < 500.00;

		bookList.stream()
				.filter(cheapBooks)
				.map(b -> b.getTitle())
				.forEach(title -> System.out.println(title));

		bookList.stream()
				.filter(b -> b.getPages() > 400)
				.forEach(b -> System.out.println(b.getTitle() + " - " + b.getPages() + " pages"));
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