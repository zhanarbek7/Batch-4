package Day34.libraryOOP;

public class Book extends LibraryItem{
    String author;

    public Book(String title, String author){
        super(title);
        this.author = author;
    }
}
