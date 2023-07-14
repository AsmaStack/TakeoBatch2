import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create library instance
        Library library = new Library();

        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Fiction");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "9780141439518", "Fiction");

        // Create borrowers
        Borrower borrower1 = new Borrower("John Doe", "123 Main St, Anytown", "555-1234");
        Borrower borrower2 = new Borrower("Jane Smith", "456 Elm St, Another town", "555-5678");

        // Add books and borrowers to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBorrower(borrower1);
        library.addBorrower(borrower2);

        // Issue a book to a borrower
        library.issueBook(book1, borrower1, "issue_date");

        // Return a book
        library.returnBook(book1);

        // Retrieve borrowing history of a borrower
        List<Transaction> borrowingHistory = library.getBorrowingHistory(borrower1);
        System.out.println("Borrowing history for " + borrower1.getName() + ":");
        for (Transaction transaction : borrowingHistory) {
            System.out.println("Book: " + transaction.getBook().getTitle() +
                    ", Issue Date: " + transaction.getIssueDate() +
                    ", Return Date: " + transaction.getReturnDate());
        }
    }
}

