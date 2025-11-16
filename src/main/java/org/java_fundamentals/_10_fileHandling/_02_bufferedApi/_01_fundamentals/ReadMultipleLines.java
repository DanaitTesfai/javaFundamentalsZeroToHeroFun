package org.java_fundamentals._10_fileHandling._02_bufferedApi._01_fundamentals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLines {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("books.txt"))){
            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }


        }catch (IOException  e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
