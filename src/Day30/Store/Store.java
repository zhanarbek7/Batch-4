package Day30.Store;

import java.util.ArrayList;
import java.util.Random;

public class Store {
    String name;
    String address;
    String city;
    String state;
    int postalCode;

    ArrayList<Item> inventory = new ArrayList<>();

    public Store(String n, String a, String c, String s, int p){
        this.name = n;
        this.address = a;
        this.city = c;
        this.state = s;
        this.postalCode = p;
    }

    public void addItem(Item item){
        item.id = inventory.size()+1;
        inventory.add(item);
        System.out.println("Store: "+name);
        System.out.println(item.name + " is added to the inventory!");
        System.out.println("Price: "+ item.price + "$, Quantity: " + item.quantity);
        System.out.println("-----------------------");
    }

    public void displayItems(){
        System.out.println(name + " ITEMS");
        for (Item i: inventory) {
            i.displayItem();
        }
    }

    public void removeById(int id){
        System.out.println("REMOVING ITEM WITH ID = "+ id);
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).id == id){
                inventory.remove(i);
            }
        }
    }

    public void updateItemById(int id, double price, int quantity){
        System.out.println("UPDATING ITEM WITH ID = " + id);
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).id == id){
                inventory.get(i).price = price;
                inventory.get(i).quantity = quantity;
            }
        }
    }
}
