package com.library.app;


import com.library.books.Library;
import com.library.stuff.Librarian;

public class LibraryApp {

    public static void main(String[] args) {

 Library library = new Library();
 library.setLibraryName("Central City Library");
 library.setTotalBooks(25000);

 Librarian librarian = new Librarian();
 librarian.setLibrarianName("Ms. Priya Sharma");
 librarian.setYearsOfExperience(12);

        library.showLibraryDetails();
        System.out.println();
        librarian.showLibrarianInfo();
    }
}
