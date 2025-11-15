package org.java_fundamentals._10_fileHandling._02_bufferedApi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class CountNumberOfLines {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("students.txt"))){
            String line;
            int studentsNum = 0;
            while ((line = reader.readLine())!= null){
                studentsNum++;
            }
            System.out.println("Total students: " + studentsNum);

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
