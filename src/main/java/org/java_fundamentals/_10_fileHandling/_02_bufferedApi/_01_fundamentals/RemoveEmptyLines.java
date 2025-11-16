package org.java_fundamentals._10_fileHandling._02_bufferedApi._01_fundamentals;

import java.io.*;

public class RemoveEmptyLines {
    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new FileReader("raw_text.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("clean_text.txt"));
        ){

            String text;
            while ((text = reader.readLine()) != null){
                if (!text.trim().isEmpty()){
                    writer.write(text.trim());
                    writer.newLine();
                }
            }
            System.out.println("Empty lines removed. Output: clean_text.txt");

        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
