package pojo_classes;

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
}
