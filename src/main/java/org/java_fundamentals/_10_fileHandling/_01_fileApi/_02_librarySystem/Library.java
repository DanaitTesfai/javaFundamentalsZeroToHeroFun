package org.java_fundamentals._10_fileHandling._01_fileApi._02_librarySystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final File file = new File("library.txt");

    public void addBook(Book book) {
        books.add(book);
        saveToFile();
        System.out.println("Book added successfully.");
    }


    public void showBooks() {
        if (books.isEmpty()){
            System.out.println("There are no books.");
            return;
        }
        System.out.println("\uD83D\uDCDA Books in Library:");
        for (Book b: books){
            System.out.println("- " + b);
        }

    }


    public void saveToFile() {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (Book b : books) {
                fileWriter.write(b.getTitle() + "," + b.getAuthor() + "\n");
            }
            fileWriter.close();


        } catch (IOException e) {
            System.out.println("Error saving book data.");
        }

    }


    public void loadFromFile() {
        try {
            if (!file.exists()){
                file.createNewFile();
                return;
            }

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] lineArray = line.split(",");
                if (lineArray.length == 2){
                    books.add(new Book(lineArray[0], lineArray[1]));
                }
            }
            reader.close();


        }catch (IOException e){
            System.out.println("Error loading file.");
        }

    }


}
