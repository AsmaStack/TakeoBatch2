import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Borrower> borrowers;
    private List<Transaction> transactions;
    
    public Library(){
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
        this.transactions=new ArrayList<>();
    }
    
    public void addBook(Book book) {
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
    
    public void issueBook(Book book, Borrower borrower, String issueDate){
        if(book.isAvailable()) {
            Transaction transaction = new Transaction(book, borrower, issueDate);
            transactions.add(transaction);
            borrower.getBorrowingHistory().add(transaction);
            book.setAvailability(false);
            System.out.println("Book '" + book.getTitle()+"' issued to" + borrower.getName()+".");
        }else {
            System.out.println("Book '" + book.getTitle()+"' is not available for borrowing.");
        }
    }

    public void returnBook(Book book){
        for (Transaction transaction: transactions){
            if(transaction.getBook() == book && transaction.getReturnDate() == null) {
                transaction.setReturnDate("current_date"); // Replace "current_date" with the actual return date
                book.setAvailability(true);
                System.out.println("Book '" +book.getTitle()+ "' returned.");
                return;
            }
        }
    System.out.println("Book '" + book.getTitle()+ "' is not currently on loan.");
}
    public List<Transaction> getBorrowingHistory(Borrower borrower){
        return  borrower.getBorrowingHistory();
    }
}