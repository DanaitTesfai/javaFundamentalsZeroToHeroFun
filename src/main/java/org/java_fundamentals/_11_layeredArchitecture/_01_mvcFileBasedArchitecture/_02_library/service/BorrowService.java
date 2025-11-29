package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.service;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.model.BorrowRecord;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.repository.BorrowRepository;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class BorrowService {
    BorrowRepository borrowRepository = new BorrowRepository();

    public List<BorrowRecord> getAllBorrowedRecords() {
        return borrowRepository.loadAllBorrowedBooks();
    }


    public void addBorrowRecord(String studentName, String bookTitle, String borrowDate) {
        if (studentName == null || studentName.trim().isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return;
        }

        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            System.out.println("Book title cannot be empty.");
            return;
        }

        //Date validation: YYYY-MM-DD
        try {
            LocalDate.parse(borrowDate);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Use YYYY-MM-DD.");
            return;
        }

        int numberOfBooksBorrowed = 0;
        List<BorrowRecord> borrowRecords = getAllBorrowedRecords();
        for (BorrowRecord b : borrowRecords) {
            if (b.getStudentName().equalsIgnoreCase(studentName.trim())) {
                numberOfBooksBorrowed++;
            }
        }

        if (numberOfBooksBorrowed >= 3) {
            System.out.println(studentName + " can not borrow more than 3 books.");
            return;
        }
        int nextBorrowId = borrowRecords.isEmpty() ? 1 : borrowRecords.get(borrowRecords.size() - 1).getBorrowID() + 1;
        BorrowRecord borrowRecord = new BorrowRecord(nextBorrowId, studentName, bookTitle, borrowDate);
        borrowRecords.add(borrowRecord);
        borrowRepository.saveAllBorrowedBooks(borrowRecords);
        System.out.println("Book borrowed with ID: " + nextBorrowId + " successfully.");
    }


    public void deleteBorrowRecordByID(int borrowId) {
        List<BorrowRecord> borrowRecords = getAllBorrowedRecords();
        boolean deleted = borrowRecords.removeIf(b -> b.getBorrowID() == borrowId);

        if (deleted) {
            borrowRepository.saveAllBorrowedBooks(borrowRecords);
            System.out.println("Book with ID: " + borrowId + " deleted successfully.");
        } else {
            System.out.println("Record not found in data store.");
        }

    }


    public List<BorrowRecord> searchByStudentName(String studentName) {
        List<BorrowRecord> borrowRecords = getAllBorrowedRecords();
        List<BorrowRecord> result = new ArrayList<>();
        for (BorrowRecord b : borrowRecords) {
            if (b.getStudentName().equalsIgnoreCase(studentName.trim())) {
                result.add(b);
            }
        }
        return result;
    }
}
