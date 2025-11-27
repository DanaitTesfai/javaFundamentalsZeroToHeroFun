package org.java_fundamentals._09_composition._05_LibraryandBooks;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b){
        if (books.contains(b)){
            System.out.println("Book added already.");
        }else {
            books.add(b);
            System.out.println("Book added successfully.");
        }
    }

    public void showBooks(){
        if (books.isEmpty()){
            System.out.println("There are no books registered.");
            return;
        }
        for (Book b: books){
            b.displayInfo();
        }
    }
}
