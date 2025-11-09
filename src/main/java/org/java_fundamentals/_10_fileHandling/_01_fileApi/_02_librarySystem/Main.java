package org.java_fundamentals._10_fileHandling._01_fileApi._02_librarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        library.loadFromFile();


        while (true){
            System.out.println("===== Mini Library Menu =====\n" +
                    "1. Add Book\n" +
                    "2. View All Books\n" +
                    "3. Delete Book\n" +
                    "4. Save & Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();

                    Book book = new Book(title, author);
                    library.addBook(book);

                    break;
                case 2:
                    library.showBooks();

                    break;
                case 3:
                    System.out.print("Enter the title of the book to remove: ");
                    String delTitle = sc.nextLine();

                    library.deleteBook(delTitle);
                    break;
                case 4:
                    System.out.println("Saved and exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
