public class Book {
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private boolean availability;

    public Book(String title, String author, String isbn, String genre, boolean availability) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.availability = availability;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return availability;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
