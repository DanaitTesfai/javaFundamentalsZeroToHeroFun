package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.repository;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.model.BorrowRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BorrowRepository {
    private final File file = new File("borrows_db.txt");

    public void saveAllBorrowedBooks(List<BorrowRecord> borrowRecords){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(file))){
            for (BorrowRecord b: borrowRecords){
                writer.write(b.getBorrowID()+ ","+b.getStudentName()+","+b.getBookTitle()+","+b.getBorrowDate());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }



    public List<BorrowRecord> loadAllBorrowedBooks(){
        try{
            if (!file.exists()){
                file.createNewFile();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        List<BorrowRecord> borrowRecords = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                String[] lineArray = line.split(",");
                int borrowId = Integer.parseInt(lineArray[0]);
                String studentName= lineArray[1];
                String bookTitle= lineArray[2];
                String borrowDate= lineArray[3];

                BorrowRecord borrowRecord = new BorrowRecord(borrowId, studentName, bookTitle, borrowDate);
                borrowRecords.add(borrowRecord);
            }


        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
        return borrowRecords;
    }
}
