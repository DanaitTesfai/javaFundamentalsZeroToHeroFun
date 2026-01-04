package org.java_fundamentals._10_fileHandling._02_bufferedApi._01_fundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt"))){
            for (int i = 0 ; i < 5 ; i++){
                System.out.print("Enter a text: ");
                String text = sc.nextLine();
                writer.write(text);
                writer.newLine();
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
