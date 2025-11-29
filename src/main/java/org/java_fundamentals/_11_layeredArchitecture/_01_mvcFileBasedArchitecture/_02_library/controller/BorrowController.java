package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.controller;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._01_course.controller.CourseController;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._01_course.service.CourseService;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.model.BorrowRecord;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.service.BorrowService;

import java.util.List;
import java.util.Scanner;

public class BorrowController {
    BorrowService borrowService = new BorrowService();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("===== LIBRARY BORROW MENU =====\n" +
                    "1. Add Borrow Record\n" +
                    "2. View All Borrow Records\n" +
                    "3. Search Records by Student Name\n" +
                    "4. Delete Borrow Record by ID\n" +
                    "5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBorrowRecord();
                    break;
                case 2:
                    viewAllBorrowRecords();
                    break;
                case 3:
                    searchByStudentName();

                    break;
                case 4:
                    deleteBorrowRecord();

                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    private void deleteBorrowRecord() {
        System.out.print("Enter borrow ID: ");
        int borrowId = sc.nextInt();

        borrowService.deleteBorrowRecordByID(borrowId);
    }

    private void searchByStudentName() {
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        List<BorrowRecord> borrowRecords = borrowService.searchByStudentName(studentName);

        if (borrowRecords.size() == 0) {
            System.out.println("No records found by the name: " + studentName);
        } else {
            for (BorrowRecord b : borrowRecords) {
                System.out.println(b);
            }
        }
    }

    private void addBorrowRecord() {
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter book title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Enter borrow date (YYYY-MM-DD): ");
        String borrowDate = sc.nextLine();


        borrowService.addBorrowRecord(studentName, bookTitle, borrowDate);
    }

    private void viewAllBorrowRecords() {
        List<BorrowRecord> borrowRecords = borrowService.getAllBorrowedRecords();

        if (borrowRecords.isEmpty()) {
            System.out.println("There are no borrowed records.");
            return;
        }
        for (BorrowRecord b : borrowRecords) {
            System.out.println(b);
        }
    }
}
