package stream_api;

import java.util.ArrayList;

public class DataFilter {
	
	public static void main(String[] args) {
		
		ArrayList<BookData> bookInfo = new ArrayList<>();
		
		bookInfo.add(new BookData("Clean Code", "Robert C. Martin", 450.00, 464));
		bookInfo.add(new BookData("The Pragmatic Programmer", "Andrew Hunt", 550.00, 352));
		bookInfo.add(null);
		bookInfo.add(new BookData("Head First Java", "Kathy Sierra", 400.00, 720));
		bookInfo.add(new BookData("Java: The Complete Reference", "Herbert Schildt", 650.00, 1248));
		bookInfo.add(null);
		bookInfo.add(new BookData("Effective Java", "Joshua Bloch", 480.00, 416));
		
		bookInfo.stream().filter(e ->  e != null && e.getPrice() >= 400.00).forEach(e -> System.out.println(e.getTitle()));
	}

}
