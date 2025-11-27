package org.java_fundamentals._09_composition._05_LibraryandBooks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter book author: ");
            String author = sc.nextLine();

            Book book = new Book(title, author);
            library.addBook(book);

        }

        System.out.println("Library contains: ");
        library.showBooks();

    }
}
