import java.util.List;
import java.time.LocalDate;

public class LibraryManagementSystem {

    public static void main(String[] args){
        Library library = new Library();


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Fiction");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "9780141439518", "Fiction");

     
        Borrower borrower1 = new Borrower("Gopal Poudel", "6044 N Sheridan Road, Chicago", "773-456-3451");
        Borrower borrower2 = new Borrower("Rajesh Bashyal", "6151 N Winthrop Ave, Chicago", "773-746-6738");


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBorrower(borrower1);
        library.addBorrower(borrower2);

        LocalDate issueDate = LocalDate.of(2023, 6, 29);
        library.issueBook(book1, borrower1, issueDate);

        library.returnBook(book1);


        List<Transaction> borrowingHistory = library.getBorrowingHistory(borrower1);

        System.out.println("Borrowing history for " + borrower1.getName() + ":");

        for (Transaction transaction : borrowingHistory) {
            System.out.println("Book: " + transaction.getBook().getTitle() + ", Issue Date: " + transaction.getIssueDate() +
                    ", Return Date: " + transaction.getReturnDate());


    }
    
}
}