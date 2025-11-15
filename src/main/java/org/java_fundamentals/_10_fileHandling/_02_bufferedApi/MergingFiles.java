package org.java_fundamentals._10_fileHandling._02_bufferedApi;

import java.io.*;

public class MergingFiles {
    public static void main(String[] args) {
        try (
                BufferedReader reader1 = new BufferedReader(new FileReader("chapter1.txt"));
                BufferedReader reader2 = new BufferedReader(new FileReader("chapter2.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("full_book.txt"))
        ) {
            String text1;
            while ((text1 = reader1.readLine())!=null){
                writer.write(text1);
                writer.newLine();
            }
            writer.newLine();
            writer.newLine();

            String text2;
            while ((text2 = reader2.readLine())!=null){
                writer.write(text2);
                writer.newLine();
            }
            System.out.println("Files merged successfully. Output: full_book.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
