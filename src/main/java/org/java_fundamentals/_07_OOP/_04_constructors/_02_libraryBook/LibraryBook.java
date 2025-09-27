package org.java_fundamentals._07_OOP._04_constructors._02_libraryBook;

public class LibraryBook {
    private String title;
    private String author;
    private double price;

    public LibraryBook(){

    }

    public LibraryBook(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo(){
        System.out.println(this);
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: "+ price;
    }
}
