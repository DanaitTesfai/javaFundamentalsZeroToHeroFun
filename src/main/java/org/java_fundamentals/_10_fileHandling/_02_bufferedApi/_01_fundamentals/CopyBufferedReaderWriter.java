package org.java_fundamentals._10_fileHandling._02_bufferedApi._01_fundamentals;

import java.io.*;

public class CopyBufferedReaderWriter {
    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("poem_backup.txt"));
        ){
            String line;
            while ((line = reader.readLine())!= null){
                writer.write(line);
                writer.newLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
