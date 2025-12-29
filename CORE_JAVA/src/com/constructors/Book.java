package com.constructors;

public class Book {
	
	private int bookId;
	private String title;
	private int availableCopies;
	
	public Book(int bookId, String title, int availableCopies) {
		this.bookId=bookId;
		this.title=title;
		this.availableCopies=availableCopies;
	}
	public int getbookId() {
		return bookId;
	}
	public String gettitle() {
		return title;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	
	public void borrowBook() {
		if(availableCopies>0) {
			availableCopies--;
			System.out.println("Book borrowed"+availableCopies);
		}
		else {
			System.out.println("Book not borrowed");
		}
	}
	public void returnBook() {
		availableCopies++;
		System.out.println("Book returned"+availableCopies);
	}
	

}
