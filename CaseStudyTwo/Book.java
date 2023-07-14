package CaseStudyTwo;

import java.time.LocalDate;

public class Book extends LibraryItem {
    private int numberOfPages;
    

    //Constructor Created
    public Book(String title, String author, LocalDate publicationDate, double price, int numberOfPages) {
        super(title, author, publicationDate, price);
        this.numberOfPages = numberOfPages;
    }

    //Random Method to display book
    public void displayBookDetails(){
        super.displayItemDetails();
        System.out.println("Number of pages: " + numberOfPages);
    }

}
