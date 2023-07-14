package CaseStudyOne;
import java.util.ArrayList;
import java.util.List;


//No idea whats this

class Library{
  private List<Book> books;
  private List<Borrower> borrowers;
  private List<Transaction> transactions;
  
  public Library(){
    this.books = new ArrayList<>();
    this.borrowers = new ArrayList<>();
    this.transactions = new ArrayList<>();
  }

  //For books
  public void addBook(Book book){
    books.add(book);
  }
  public void removeBook(Book book){
    books.remove(book);
  }
  public void addBorrower(Borrower borrower){
    borrowers.add(borrower);
  }
  public void removeBorrower(Borrower borrower){
    borrowers.remove(borrower);
  }

  public void issueBook(Book book, Borrower borrower, String issueDate, String returnDate ){
    if (book.isAvailable()){
        //Transaction transaction = new Transaction(book, borrower, issueDate);
        
        Transaction transaction = new Transaction(book, borrower, issueDate, returnDate);
        transactions.add(transaction);

        borrower.getBorrowingHistory().add(transaction);
        book.setIsAvailable(false);

        System.out.println("*----------*----------*---------*------*");
        System.out.println("Book : "+book.getTitle()+" is issued to :"+borrower.getName()+".");
    }else{
        System.out.println("Book : "+book.getTitle()+" is not available ");
    }
  }
  public void returnBook(Book book){
    for (Transaction transaction : transactions){
        if ((transaction.getBooks() == book) && (transaction.getReturnDate() == null)) {
            transaction.setReturnDate("03/29/2023");
            book.setIsAvailable(true);
            System.out.println("Book "+book.getTitle()+" is returned ");
            return;
        }
    }
    System.out.println("Book :" + book.getTitle() + "' is taken.");
    
  }

  public List<Transaction> getBorrowingHistory(Borrower borrower) {
    return borrower.getBorrowingHistory();
}


}