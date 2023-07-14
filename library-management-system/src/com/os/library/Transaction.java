package com.os.library;

public class Transaction {
    private Book book;
    private Borrower borrower;
    private String issueDate;
    private String returnDate;

    public Transaction(Book book, Borrower borrower, String issueDate, String returnDate) {
        this.book = book;
        this.borrower = borrower;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        String transaction = "Book: " + this.book.getTitle() + "\n";
        transaction += "Borrower: " + this.borrower.getName() + "\n";
        transaction += "Issue Date: " + this.issueDate + "\n";
        transaction += "Return Date: " + this.returnDate + "\n";

        return transaction;
    }
}