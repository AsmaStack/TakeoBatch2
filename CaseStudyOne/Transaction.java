package CaseStudyOne;
class Transaction{
    private Book book;
    private Borrower borrower;
    private String issueDate;
    private String returnDate;

    //Constructor or method declaration ???

    public Transaction(Book book, Borrower borrower, String issueDate, String returnDate){
        this.book = book;
        this.issueDate = issueDate;
        this.returnDate = null;
        this.borrower = borrower;
    }
    //For books

    public void setBooks(Book book){
        this.book = book;
    }
    public Book getBooks(){
        return book;
    }

    //For borrower

    public void setBorrower(Borrower borrower){
        this.borrower = borrower;
    }
    public Borrower getBorrower(){
        return borrower;
    }
    //For contact number

    public void setIssueDate(String issueDate){
        this.issueDate = issueDate;
    }
    public String getIssueDate(){
        return issueDate;
    }
    //For return date

    public void setReturnDate(String returnDate){
        this.returnDate = returnDate;
    }
    public String getReturnDate(){
        return returnDate;
    }
}