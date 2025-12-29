package BLC_ELC;

public class libraryBLC {
	int bookId;
	String title;
	String author;
	double price;
	
	public int getBookID() {
		return bookId;
	}
	public void setBookID(int BookId) {
		bookId=BookId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String Title) {
		title=Title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String Author) {
		author=Author;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(Double Price) {
		price=Price;
	}
	
	public String displayData() {
		return "Book ID: " +bookId+ "\nTitle: " +title+ "\nAuthor: " +author+ "\nPrice: " +price;
	}
	
}
