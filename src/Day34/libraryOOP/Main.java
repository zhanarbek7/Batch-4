package Day34.libraryOOP;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        DVD dvd = new DVD("DVD1", "Director1");
        Book book = new Book("Book1", "Author1");

        library.addItem(dvd);
        library.addItem(book);

        library.displayItems();

        library.updateItem(1, "DVD");

        library.displayItems();

        library.removeItem(1);

        library.displayItems();


    }
}
