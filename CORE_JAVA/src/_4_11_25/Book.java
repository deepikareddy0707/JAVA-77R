package _4_11_25;

public class Book {
	String bookTitle;
	String author;
	long isbn;
	
	void addBookDetails(String title,String Author,long Isbn) {
		bookTitle=title;
		author=Author;
		isbn=Isbn;
	}
	
	String displayDetails() {
		return "Book Title: " + bookTitle + " Book Author: " +author+ " Book ISBN: " +isbn;
	}

	public static void main(String[] args) {
		Book obj=new Book();
		obj.addBookDetails("The Great Inspiration", "Dhoni", 1900000);
		System.out.println(obj.displayDetails());

	}

}
