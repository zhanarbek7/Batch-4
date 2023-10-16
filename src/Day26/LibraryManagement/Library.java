package Day26.LibraryManagement;

public class Library {
    String name;
    int numberOfBooks = 0;
    Book[] books = new Book[4];

    public Library(String name){
        this.name = name;
    }

    public void addBook(Book book){
        if(numberOfBooks<books.length){
            books[numberOfBooks] = book;
            numberOfBooks++;
            System.out.println(book.title +" successfully added!");
        }
        else{
            System.out.println("No place to add a book "+book.title);
        }
    }

    public void displayBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println("Title = " + books[i].title);
            System.out.println("Is Available = " + books[i].isAvailable);
            System.out.println("-----------------------------");
        }
    }
}
