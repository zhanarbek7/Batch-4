package Day34.libraryOOP;

public class LibraryItem {
    int id;
    String title;
    static int numberOfItems;

    public LibraryItem(String title){
        numberOfItems++;
        this.title = title;
        id = numberOfItems;
    }
}
