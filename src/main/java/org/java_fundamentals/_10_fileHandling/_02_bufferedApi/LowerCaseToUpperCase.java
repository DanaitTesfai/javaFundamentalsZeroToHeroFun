package org.java_fundamentals._10_fileHandling._02_bufferedApi;

import java.io.*;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        try (
                BufferedReader buffReader = new BufferedReader(new FileReader("story.txt"));
                BufferedWriter buffWriter = new BufferedWriter(new FileWriter("story_upper.txt"));
        ){
            String text;
            while ((text = buffReader.readLine()) != null ){
                buffWriter.write(text.toUpperCase());
                buffWriter.newLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
