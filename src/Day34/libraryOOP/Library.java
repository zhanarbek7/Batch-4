package Day34.libraryOOP;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem> libraryItems = new ArrayList<>();

    public void addItem(LibraryItem item){
//        item.id = libraryItems.size()+1; -> 1st way
        libraryItems.add(item);
        System.out.println(item.title + " was added!");
    }

    public void displayItems(){
        System.out.println("ITEMS in the library");
        for(LibraryItem item: libraryItems){
            System.out.println("Title: "+item.title);
            System.out.println("ID: "+ item.id);
            if( item instanceof Book){
                System.out.println("Author: "+((Book)item).author);
            }
            else{
                System.out.println("Director: "+ ((DVD)item).director);
            }
            System.out.println("-----------------------");
        }
    }

    public void updateItem(int id, String newTitle){
        boolean found = false;

        for(int i = 0; i < libraryItems.size(); i++){
            if(libraryItems.get(i).id == id){
                libraryItems.get(i).title = newTitle;
                found = true;
            }
        }

        if(found){
            System.out.println("Updated item with id: "+ id);
        }
        else{
            System.out.println("Failed to update item with id: "+ id);
        }
    }

    public void removeItem(int id){
        boolean found = false;

        for(int i = 0; i < libraryItems.size(); i++){
            if(libraryItems.get(i).id == id){
                libraryItems.remove(i);
                found = true;
            }
        }

        if(found){
            System.out.println("Removed item with id: "+ id);
        }
        else{
            System.out.println("Removed to update item with id: "+ id);
        }
    }

}
