package CaseStudyTwo;

import java.time.LocalDate;

public class Journal extends LibraryItem{
    
    private String ISSN;


    //Created Constructor
    public Journal(String title, String author, LocalDate publicationDate, double price, String ISSN){
        super(title, author, publicationDate, price);
        this.ISSN = ISSN;
    }

    //Creating Random Method to display

    public void displayJournal(){
        super.displayItemDetails();
        System.out.println("ISSN: " + ISSN);
    }



}
