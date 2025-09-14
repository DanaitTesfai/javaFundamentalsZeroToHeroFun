package org.java_fundamentals._07_OOP._01_classedAndObjects._02_book;

public class Main {
    public static void main(String[] args) {
        Book javaBook = new Book();

        String title = "Java Programming";
        String author = "John Doe";
        double price = 45.5;
        boolean available = true;

        javaBook.title = title;
        javaBook.author = author;
        javaBook.price = price;
        javaBook.available = available;

        javaBook.borrowBook();
        javaBook.returnBook();
        javaBook.displayBookInfo();
    }
}
