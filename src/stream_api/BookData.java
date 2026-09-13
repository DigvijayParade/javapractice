package stream_api;

import java.util.Objects;

public class BookData {

	private String title;
	private String author;
	private double price;
	private int pages;

	public BookData() {}

	public BookData(String title, String author, double price, int pages) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, pages, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookData other = (BookData) obj;
		return Objects.equals(author, other.author) && pages == other.pages
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "BookData [title=" + title + ", author=" + author + ", price=" + price + ", pages=" + pages + "]";
	}
}