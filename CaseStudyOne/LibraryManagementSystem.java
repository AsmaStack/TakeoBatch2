package CaseStudyOne;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args){
        Library library = new Library();

        //New books
        Book book1 = new Book("Himself", "Jess Kidd", "9780743273565", "Fiction",true);
        Book book2 = new Book("Gorgeous Lies", "Martha McPhee", "9780743273245", "Poetic",true);
        Book book3 = new Book("The Winemakers Wife", "Kristin Harmel", "8580743273565", "Historic",true);

        //creating borrowers

        Borrower borrower1 = new Borrower("Nayan", "123 Second St, Anytown", "555-555-5555");
        Borrower borrower2 = new Borrower ("Hito", "432 Second St, Anytown", "999-999-999");


        // Add books and borrowers to library

        library.addBook(book1);
        library.addBook(book2);
        library.addBorrower(borrower1);
        library.addBorrower(borrower2);


        //Issue new book

        library.issueBook(book3, borrower1, "04/12/2023","05/24/2023");
        

        //Return the book
        library.returnBook(book1);
        

        //Receive history
        List<Transaction> borrowingHistory = library.getBorrowingHistory(borrower1);
        System.out.println("Borrowing history: "+borrower1.getName()+":");
        for(Transaction transaction:borrowingHistory){
            System.out.println("Book: "+transaction.getBooks().getTitle()+", Issue Date: "+transaction.getIssueDate()+", Return Date: "+transaction.getReturnDate());
        }

    }
}
