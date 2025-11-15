package org.java_fundamentals._10_fileHandling._02_bufferedApi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountingWords {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("article.txt"))){
            String text;
            int countWords = 0;
            while ((text = reader.readLine()) != null){
                String[] words = text.trim().split("\\s+");
                //System.out.println(Arrays.toString(words));
                if (!text.isEmpty()){
                    countWords += words.length;
                }
            }
            System.out.println("Total words: " + countWords);


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
