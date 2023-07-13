import java.util.List;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create some books
        Book book1 = new Book("Think Like a Monk", "Jay Shetty", "9781982134488", "Self Help", true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Fiction", true);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Fiction", true);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some borrowers
        Borrower borrower1 = new Borrower("John Doe", "123 Main St", "123-456-7890");
        Borrower borrower2 = new Borrower("Jane Smith", "456 Elm St", "987-654-3210");

        // Add borrowers to the library
        library.addBorrower(borrower1);
        library.addBorrower(borrower2);

        // Issue a book to a borrower
        library.issueBook(book1, borrower1,"2023/07/13");

        // Return a book
        library.returnBook(book1);

        // Get borrowing history of a borrower
        List<Transaction> borrowingHistory = library.getBorrowingHistory(borrower1);
        for (Transaction transaction : borrowingHistory) {
            System.out.println("Book Title: " + transaction.getBook().getTitle());
            System.out.println("Issue Date: " + transaction.getIssueDate());
            System.out.println("Return Date: " + transaction.getReturnDate());
            System.out.println();
        }
    }
}
