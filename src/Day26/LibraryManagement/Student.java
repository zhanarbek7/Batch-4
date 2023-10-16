package Day26.LibraryManagement;

public class Student {
    String name;
    int age;
    String gender;

    Book currentlyReading;

    public Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void startReading(Book book){
        // Book - might be already assigned to some student
        // Book - might be available
        //
        // Student - might have a currently reading book
        // Student - mightn't have a currently reading book
        if( book.isAvailable == false ){
            System.out.println(name + " can't read " +book.title+" because it is occupied");
        }
        else if(currentlyReading == null){
            currentlyReading = book; // it means student1 started reading a book
            currentlyReading.isAvailable = false; // make a book occupied
            // We prove that student1 really reads some book
            System.out.println(name +" started reading "+ currentlyReading.title);
        }
        else{
            System.out.println(name+" first needs to finish " + currentlyReading.title);
        }
    }

    public void stopReading(){
        // 1 case student doesn't have book
        // 2 case student has a book
        if(currentlyReading == null){
            System.out.println(name + " doesn't have a book!");
        }
        else{
            currentlyReading.isAvailable = true;
            currentlyReading = null; // stopped reading a book
        }

    }
}
