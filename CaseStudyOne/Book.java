package CaseStudyOne;
class Book{

    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private boolean isAvailable;

    //Constructor or method declaration ???
    public Book(String title, String author, String ISBN, String genre, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.isAvailable = true;
    }

    //For Title
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

        //AUthor
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    //For ISBN

    public void setISBN(String ISBN){
        this.ISBN= ISBN;
    }

    public String getISBN(){
        return ISBN;
    }
    //For Genre
    public void setGenre(String Genre){
        this.genre = Genre;
    }
    public String getGenre(){
        return genre;
    }

    //For isAvailable
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
}






