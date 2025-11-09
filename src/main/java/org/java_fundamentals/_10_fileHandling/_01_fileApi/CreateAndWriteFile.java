package org.java_fundamentals._10_fileHandling._01_fileApi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.LocalTime.now;

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
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            String formattedTime = currentTime.format(formatter);

            fileWriter.write("Current date and time is "+ currentDate +", "+ formattedTime);
            System.out.println("Date and time updated successfully");
            fileWriter.close();

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
