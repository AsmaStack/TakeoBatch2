import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Borrower> borrowers;
    private List<Transaction> transactions;

    public Library() {
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }

    public void removeBorrower(Borrower borrower) {
        borrowers.remove(borrower);
    }

    public void issueBook(Book book, Borrower borrower,String issuedDate) {
        if (book.isAvailable()) {
            book.setAvailability(false);
            Transaction transaction = new Transaction(book, borrower, issuedDate, null);
            transactions.add(transaction);
            borrower.getBorrowingHistory().add(transaction);
        } else {
            System.out.println("Sorry, the book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailability(true);
        for (Transaction transaction : transactions) {
            if (transaction.getBook().equals(book) && transaction.getReturnDate() == null) {
                transaction.setReturnDate("21/07/2023");
                break;
            }
        }
    }

    public List<Transaction> getBorrowingHistory(Borrower borrower) {
        List<Transaction> borrowingHistory = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getBorrower().equals(borrower)) {
                borrowingHistory.add(transaction);
            }
        }
        return borrowingHistory;
    }
}

