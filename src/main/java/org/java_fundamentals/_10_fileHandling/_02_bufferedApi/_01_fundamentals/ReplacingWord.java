package org.java_fundamentals._10_fileHandling._02_bufferedApi._01_fundamentals;

import java.io.*;
import java.util.Scanner;

public class ReplacingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to be replaced: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        try (
                BufferedReader reader = new BufferedReader(new FileReader("lesson.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("edited_lesson.txt"))
        ) {
            String text;
            while((text = reader.readLine())!= null){
                writer.write(text.replace(oldWord,newWord));
                writer.newLine();
            }
            System.out.println("Word replaced successfully. Output: edited_lesson.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
