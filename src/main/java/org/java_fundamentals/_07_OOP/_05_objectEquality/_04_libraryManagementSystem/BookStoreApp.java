package org.java_fundamentals._07_OOP._05_objectEquality._04_libraryManagementSystem;

import org.java_fundamentals._07_OOP._05_objectEquality._03_gymMembership.GymMembership;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStoreApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("===== Librarian Login =====");

        String username = "librarian";
        String password = "lib123";

        String userN;
        String passW;

        while (true) {
            System.out.print("Enter username: ");
            userN = input.nextLine();

            System.out.print("Enter password: ");
            passW = input.nextLine();

            if (userN.equals(username) && passW.equals(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Wrong username or password. Please try again.");
            }
        }


        System.out.println(" === Library Menu ===");

        while (true) {
            System.out.println("1. Add Book\n" +
                    "2. View Books\n" +
                    "3. Search Book by Title\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine();


            switch (option) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = input.nextLine();

                    System.out.print("Enter Title: ");
                    String title = input.nextLine();

                    System.out.print("Enter Author: ");
                    String author = input.nextLine();

                    Book book1 = new Book(bookId, title, author);
                    if (books.contains(book1)) {
                        System.out.println("Duplicate book! Cannot add.");
                    } else {
                        books.add(book1);
                        System.out.println("Book registered successfully!");
                    }
                    break;


                case 2:
                    if (books.isEmpty()) {
                        System.out.println("There are no books.");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter book ID to search: ");
                    String newBook = input.nextLine();

                    boolean isFound = false;
                    for (Book b : books) {
                        if (b.getBookId().equals(newBook)) {
                            System.out.println("Book found: " + b);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Book not found.");
                    }
                    break;


                case 4:
                    System.out.println("Exiting System... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid input. Please try again.");

            }
        }
    }
}
