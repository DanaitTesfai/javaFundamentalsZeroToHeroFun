package org.java_fundamentals._07_OOP._02_book;

public class Book {
    String title;
    String author;
    double price;
    boolean available;


    public void borrowBook(){
        available = false;
        System.out.println("The book " + title +" has been borrowed.");
    }

    public void returnBook(){
        available = true;
        System.out.println("The book " + title +" has been returned.");
    }

    public void displayBookInfo(){
        System.out.println("Book Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + available);
    }



}
