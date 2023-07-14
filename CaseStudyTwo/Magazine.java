package CaseStudyTwo;

import java.time.LocalDate;

public class Magazine extends LibraryItem{
    
    private String publisher;

    //Created Constructor

    public  Magazine(String title, String author, LocalDate publicationDate, double price, String publisher){
        super(title,author,publicationDate,price);
        this.publisher = publisher;
    }

    //Created Random Methods

    public void displayMagazineDetails(){
        super.displayItemDetails();
        System.out.println("Publisher: "+publisher);
    }

}
