package CaseStudyTwo;

import java.time.LocalDate;

public class LibraryItem {
    protected String title;
    protected String author;
    protected LocalDate publicationDate;
    protected double price;

    //Constructor Created

    public LibraryItem(String title, String author, LocalDate publicationDate, double price){
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.price = price;

    }
    // Getter & Setter - Title
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    //Getter & Setter - Author
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    //Getter & Setter - Publication Date
    public void setPublicationDate(LocalDate publicationDate){
        this.publicationDate = publicationDate;
    }
    public LocalDate getPublicationDate(){
        return publicationDate;
    }

    //Getter & setter - price
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void displayItemDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Price: $"+price);
    }

}
