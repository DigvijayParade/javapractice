package pojo_classes;

import java.util.Objects;

public class Library {

	private String bookName;
	private int bookId ;
	private double price ;

	public Library() {
		
	}
	
	public Library (String bookName,int bookId,double price ) {
		
		this.bookName = bookName ;
		this.bookId = bookId ;
		this.price = price ;
	}
	
	public void setName(String name) {this.bookName = name ;}
	public void setBookid(int id) {this.bookId = id ;}
	public void setPrice(double price) {this.price = price ;}
	
	public String getName() {return this.bookName ;}
	public int getId() {return this.bookId ;}
	public double getPrice() {return this.price ;}
	
	@Override
	public String toString() {
		
		return "Book Name : "+ bookName + " Book ID : "+bookId+" Book Price : "+price ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId, bookName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return bookId == other.bookId && Objects.equals(bookName, other.bookName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
}
