package Day32;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1,"apple");
        fruits.put(2,"banana");
        fruits.put(3,"watermelon");
        fruits.put(4, "strawberry");
        fruits.put(5, "cherry");

        //Use a loop to print hashMap like this
        // id = 1, fruit = apple
        // id = 2, fruit = banana
        // id = 3, fruit = watermelon
        // id = 4, fruit = strawberry
        // id = 5, fruit = cherry


//        for(Map.Entry<Integer, String> entry: fruits.entrySet()){
//            System.out.println("id = " + entry.getKey() +", fruit = " + entry.getValue());
//        }

        //Use a loop to print hashMap like this
        // id = 1
        // id = 2
        // id = 3
        // id = 4
        // id = 5
        for(Integer key: fruits.keySet()){
            String fruitName = fruits.get(key);
            System.out.println(key + " "+ fruitName);
        }

        //Use a loop to print hashMap like this
        // fruit = apple
        // fruit = banana
        // fruit = watermelon
        // fruit = strawberry
        // fruit = cherry
//
//        for(String value: fruits.values()){
//            System.out.println(value);
//        }
    }
}
