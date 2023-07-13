class Book{

    private String title;
    private String author;
    private String isbn;
    private String genre;
    private boolean availabilityStatus;


//Constructor
    public Book(String title, String author, String isbn, String genre){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.genre=genre;
        this.availabilityStatus=true;

    }

    //Setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author=author;
    
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }

    public void setAvailabilityStatus(boolean availabilityStatus){
        this.availabilityStatus=availabilityStatus;
    }



    //Getters
    public String getTitle(){
        return title;
    }

     public String getAuthor(){
        return author;
    }

     public String getIsbn(){
        return isbn;
    }

     public String getGenre(){
        return genre;
    }

     public boolean isAvailable(){
        return availabilityStatus;
    }

}