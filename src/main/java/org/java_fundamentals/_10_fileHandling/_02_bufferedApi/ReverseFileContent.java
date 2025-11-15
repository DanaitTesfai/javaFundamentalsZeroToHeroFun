package org.java_fundamentals._10_fileHandling._02_bufferedApi;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseFileContent {
    public static void main(String[] args) {
        ArrayList<String> poemLines = new ArrayList<>();
        try (
                BufferedReader reader = new BufferedReader(new FileReader("verse.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("verse_reversed.txt"))
        ) {
            String line;
            while ((line = reader.readLine())!= null){
                poemLines.add(line);
            }

            System.out.println(poemLines);
            Collections.reverse(poemLines);
            System.out.println(poemLines);

            for (String s: poemLines){
                writer.write(s);
                writer.newLine();
            }
            System.out.println("Text reversed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
