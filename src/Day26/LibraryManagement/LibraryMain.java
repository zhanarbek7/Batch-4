package Day26.LibraryManagement;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author1",100, 1985);
        Book book2 = new Book("Book2", "Author2",200, 2003);
        Book book3 = new Book("Book3", "Author3",144, 2009);
        Book book4 = new Book("Book4", "Author4",400, 2023);
        Book book5 = new Book("Batch4", "Author5", 123, 2015);

        Library library = new Library("Rosemont Library");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Book1
        // Book2
        // Book3
        // Book4

        System.out.println(library.name);
        library.displayBooks();

        Student student1 = new Student("Student1",16,"M");
        Student student2 = new Student("Student2",23,"F");
        Student student3 = new Student("Student3",21,"M");


        System.out.println("AFTER 1");
        student1.startReading(book1);
        student1.startReading(book2);
        student2.startReading(book2);
        student3.startReading(book2);
        library.displayBooks();


        System.out.println("AFTER 2");
        student2.stopReading(); // student2 stopped
        student2.startReading(book4);
        library.displayBooks();



    }
}
