public class Book{

    // instance variable
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;
    private String bookGenre; 
    private boolean bookAvailabilityStatus;

    public Book(String bookTitle, String bookAuthor, String bookISBN, String bookGenre) { 

        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.bookGenre = bookGenre;
        this.bookAvailabilityStatus = true;
    } 

    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookISBN() {
        return bookISBN;
    }
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
    public String getBookGenre() {
        return bookGenre;
    }
    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }
    public boolean isBookAvailabilityStatus() {
        return bookAvailabilityStatus;
    }
    public void setBookAvailabilityStatus(boolean bookAvailabilityStatus) {
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }

    public static void main(String[] args) {
        
    }
}