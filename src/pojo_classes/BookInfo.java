package pojo_classes;

public class BookInfo {

	
	public static void main(String[] args) {
		
	String [] names = {"Ikigai","The Prince","Harry Potter","Java is Dead? : Return of Java"};
	int [] bookid = {101,102,103,104};
	double [] prices = {1000,782,963,963.12};

	Library [] booksinfo = new Library[4];
	
	for (int i = 0 ;i < booksinfo.length ;i++) {
		
		booksinfo [i] = new Library(names[i],bookid[i],prices[i]);
	}
	
	for(Library books : booksinfo) {
		
		System.out.println(books);
		
	}
	
	//now if i want increase the price of the book java the return
	
	booksinfo[3].setName("The Return od Java !!");
	booksinfo[3].setPrice(10000.00);
	
	System.out.println(booksinfo[3]);
	//one more time
	System.out.println("Update the Price and name of the 4th book :"+booksinfo[3].getPrice()+booksinfo[3].getName());
	}
}
