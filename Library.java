import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books; 
    private List<Borrower> borrowers; 
    private List<Transaction> transactions;
    
    public Library()
    {
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }


    public void addBook(Book book)
    {
        books.add(book);
    }
    public void removeBook(Book book)
    {
        books.remove(book);
    }


    public void addBorrowers(Borrower borrower)
    {
        borrowers.add(borrower);
    }
    public void removeBorrower(Borrower borrower)
    {
        borrowers.remove(borrower);
    }


    public void issueBook(Book book, Borrower borrower, String issueDate)
    {
        if (book.isBookAvailabilityStatus())
        {
            Transaction transaction = new Transaction(book, borrower, issueDate);
            transactions.add(transaction);
            borrower.getBorrowinghistory().add(transaction);
            book.setBookAvailabilityStatus(false);
            System.out.println("Book: " + book.getBookTitle()+ "Issued to: " +borrower.getBorrowerName() + ".");
        }
        else
        {
            System.out.println("Book: " + book.getBookTitle()+ "is not available for borrowing");

        }
    }

    public void returnBook(Book book)
    {
        for (Transaction transaction : transactions)
        {
            if(transaction.getBook() == book && transaction.getReturndate()== null)
            {
                transaction.setReturndate("current_date");
                book.setBookAvailabilityStatus(true);
                System.out.println("Book" + book.getBookTitle()+ "returned.");
                return;
            }
        }
        System.out.println("Book" + book.getBookTitle()+ "is not currently on loan.");
    }
    public List<Transaction> getBorrowingHistory(Borrower borrower)
    {
        return borrower.getBorrowinghistory();
    }
    public static void main(String[] args) {
        
    }
}