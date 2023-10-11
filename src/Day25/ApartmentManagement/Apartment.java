package Day25.ApartmentManagement;

public class Apartment {

    int rooms;
    int size;
    int price;
    Person[] people;

    public Apartment(int rooms, int size, int price){
        this.rooms = rooms;
        this.size = size;
        this.price = price;
        // 1bd apartment -> 2
        // 2bd apartment -> 4
        // 3bd apartment -> 6
        // 4bd apartment -> 8
        people = new Person[rooms*2];
    }



}
