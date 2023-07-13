import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
class Library {
    
    private List<Book> book;
    private List<Borrower> borrower;
    private List<Transaction> transaction;

public Library(){
    this.book=new ArrayList<>();
    this.borrower=new ArrayList<>();
    this.transaction=new ArrayList<>();
}

public void addBook(Book book){
    this.book.add(book);
}

public void removeBook(Book book){
    this.book.remove(book);
}

public void addBorrower(Borrower borrower){
    this.borrower.add(borrower);
}

public void removeBorrower(Borrower borrower){
    this.borrower.remove(borrower);
}


public void issueBook(Book book, Borrower borrower, LocalDate issueDate){
    if(book.isAvailable()){
        Transaction transaction = new Transaction(book, borrower, issueDate);
        this.transaction.add(transaction);
        borrower.getBorrowingHistory().add(transaction);
        book.setAvailabilityStatus(false);
        System.out.println("Book " +book.getTitle() + " issued to " + borrower.getName() + ".");
    }
    else{
        System.out.println("Book " +book.getTitle() + " is not available for borrowing.");
    }
}


public void returnBook(Book book){
    for(Transaction transaction: transaction){
        if(transaction.getBook()==book && transaction.getReturnDate()==null){
            transaction.setReturnDate(LocalDate.now());
            book.setAvailabilityStatus(true);
            System.out.println("Book " +book.getTitle() + " is returned.");
            return;
        }

    }

    System.out.println("Book " +book.getTitle() + " is not currently on loan.");
}

public List<Transaction> getBorrowingHistory(Borrower borrower){
    return borrower.getBorrowingHistory();
}
}
