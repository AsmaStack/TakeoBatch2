import java.time.LocalDate;

class Transaction {
    
    private Book book;
    private Borrower borrower;
    private LocalDate issueDate;
    private LocalDate returnDate;


//Constructor
public Transaction(Book book, Borrower borrower, LocalDate issueDate){
    this.book=book;
    this.borrower=borrower;
    this.issueDate=issueDate;
    this.returnDate=null;
}

//Setters
    public void setBook(Book book){
        this.book=book;
    }

    public void setBorrower(Borrower borrower){
        this.borrower=borrower;
    }

    public void setIssueDate(LocalDate issueDate){
        this.issueDate=issueDate;
    }

    public void setReturnDate(LocalDate returnDate){
        this.returnDate=returnDate;
    }


    //Getters
    public Book getBook(){
        return book;
    }

    public Borrower getBorrower(){
        return borrower;
    }

    public LocalDate getIssueDate(){
        return issueDate;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }
}
