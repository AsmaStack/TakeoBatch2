package casestudytwo;

import java.time.LocalDate;

public class Magazine extends LibraryItem {
    private String publisher;

    public Magazine(String title, String author, LocalDate publicationDate, double price, String publisher) {
        super(title, author, publicationDate, price);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String displayItemDetails() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }

}
