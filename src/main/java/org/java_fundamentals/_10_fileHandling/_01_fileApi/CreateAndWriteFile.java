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
        Scanner sc = new Scanner(System.in);

        try { //Creating a file.
            File file = new File("student.txt");
            if (file.createNewFile()){
                System.out.println("File created.");
            }else {
                System.out.println("File already exists.");
            }




            //writing a file.
            FileWriter fileWriter = new FileWriter("student.txt");
            fileWriter.write("My name is Danait.\n" + "My favorite subject is physics.\n");
            System.out.println("File written successfully.");
            fileWriter.close();




            //appending a file.
            fileWriter = new FileWriter("student.txt", true);
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            String formattedTime = currentTime.format(formatter);

            fileWriter.write("Current date and time is "+ currentDate +", "+ formattedTime);
            System.out.println("Date and time updated successfully");
            fileWriter.close();



            //reading a file
            Scanner reader = new Scanner(file);
            int i = 0;
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
                i++;
            }
            reader.close();
            System.out.println("This file has " + i + " lines.");





            //deleting a file
            System.out.print("Do you want to delete the file? (yes/no)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")){
                if (file.delete()){
                    System.out.println("File deleted successfully.");
                }else {
                    System.out.println("File not deleted.");
                }


            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Exiting...");
            }else {
                System.out.println("Invalid input.");
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
