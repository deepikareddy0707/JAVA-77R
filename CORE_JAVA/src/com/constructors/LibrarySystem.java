package com.constructors;

public class LibrarySystem {
	

	public static void main(String[] args) {
		
		Book book=new Book(100, "abc", 2);
		System.out.println("Book Details:");
		System.out.println("Book ID:"+book.getbookId());
		System.out.println("Title:"+book.gettitle());
		System.out.println("Available copies:"+book.getAvailableCopies());
		
		
		for(int i=1;i<=5;i++) {
			if(i<=3) {
				System.out.println("Attempt to borrow a book");
				book.borrowBook();
			}
			else {
				System.out.println("Attempt to return a book");
				book.returnBook();

			}
			
		}
		System.out.println("Library system transactions completed");


	}

}
