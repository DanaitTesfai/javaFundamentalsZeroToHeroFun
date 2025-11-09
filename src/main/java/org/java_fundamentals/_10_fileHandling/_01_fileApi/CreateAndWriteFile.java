package org.java_fundamentals._10_fileHandling._01_fileApi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteFile {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            if (file.createNewFile()){
                System.out.println("File created.");
            }else {
                System.out.println("File already exists.");
            }

            FileWriter fileWriter = new FileWriter("student.txt");
            fileWriter.write("My name is Danait.\n" + "My favorite subject is physics.\n");
            System.out.println("File written successfully.");
            fileWriter.close();

            fileWriter = new FileWriter("student.txt", true);
            fileWriter.write("Current date and time is 11/09/2025 , 09:06 am.");
            System.out.println("Date and time updated successfully");
            fileWriter.close();


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
