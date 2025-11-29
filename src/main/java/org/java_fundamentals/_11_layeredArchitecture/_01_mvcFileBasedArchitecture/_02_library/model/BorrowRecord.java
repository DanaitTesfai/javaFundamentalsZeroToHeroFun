package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.model;

public class BorrowRecord {
    private int borrowID;
    private String studentName;
    private String bookTitle;
    private String borrowDate;

    public BorrowRecord(int borrowID, String studentName, String bookTitle, String borrowDate) {
        this.borrowID = borrowID;
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        this.borrowDate = borrowDate;
    }

    public int getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(int borrowID) {
        this.borrowID = borrowID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    @Override
    public String toString() {
        return borrowID + " - " + studentName + " borrowed " +  "\""  + bookTitle + "\"" + " on " + borrowDate;
    }
}
