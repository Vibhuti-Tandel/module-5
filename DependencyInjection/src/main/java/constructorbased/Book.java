package constructorbased;

public class Book {

	private int bid;
	private String bname,author;
	private double price;
	
	
	public Book() {
		super();
	}


	public Book(int bid, String bname, String author, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
