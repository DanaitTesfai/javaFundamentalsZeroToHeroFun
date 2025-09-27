package org.java_fundamentals._07_OOP._04_constructors._02_libraryBook;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryBookApp {
    public static void main(String[] args) {
        ArrayList<LibraryBook> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        LibraryBook book1 = new LibraryBook("Java Basics", "John Smith", 50);
        LibraryBook book2 = new LibraryBook("Data Structures", "Alice Johnson", 60);
        LibraryBook book3 = new LibraryBook("Algorithms in Java", "Thomas Cormen", 70);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }

        System.out.println();

        for (LibraryBook b : books){
            System.out.println(b);
        }

        System.out.print("Enter a book title to search: ");
        String bookWanted = input.nextLine();

        boolean isFound = false;
        for (LibraryBook book : books) {
            if (book.getTitle().equalsIgnoreCase(bookWanted)){
                book.displayInfo();
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Book not found.");
        }



    }
}
