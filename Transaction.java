

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

    // Getters
    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    // Setters
    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}


