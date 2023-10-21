package Day31;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
//        list.add(6);
//
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Mike", 20);
//        map.put("John", 30);
//        map.put("Alex",15);
//        map.put("Lisa",50);
//        map.put("Mike",30);
//        map.put("Lisa",1);
//
//        System.out.println(map);
//
//
//        HashMap<String, String> capitals = new HashMap<>();
//        capitals.put("England","London");
//        capitals.put("Italy","Rome");
//        capitals.put("Canada","Ottawa");
//        capitals.put("England","Moscow");
//        capitals.put("USA","Washington D.C");
//        System.out.println(capitals);
//
//        HashMap<String, Double> fruits = new HashMap<>(){{
//          put("Apple",1.0);
//          put("Banana",3.0);
//        }};
//
//        System.out.println(fruits.get("Banana"));
//        fruits.remove("Banana");
//        fruits.put("Watermelon",10.0);
//        System.out.println(fruits.size());
//
//
//        HashMap<String, Integer> numbers = new HashMap<>();
//        numbers.put("One", 1);
//        numbers.put("Two", 2);
//        numbers.put("Three", 3);
//        numbers.put("Four", 4);
//        numbers.put("Five", 1);
//
//        System.out.println(numbers.containsKey("Four"));
//        System.out.println(numbers.containsValue(1));
//
//        // entrySet()
////        for(Map.Entry<String, Integer> i : numbers.entrySet()){
////            System.out.println(i.getKey() + " = " + i.getValue());
////        }
//        // keySet()
////        System.out.println();
////        for (String i: numbers.keySet()) {
////            System.out.println(i);
////        }
//        // values()
////        System.out.println(numbers);
////        for(Integer i: numbers.values()){
////            System.out.println(i);
////        }
//
//        // putAll()
////        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
////        hashMap1.put(1,100);
////
////        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
////        hashMap2.put(2,200);
////        hashMap2.put(1,400);
////
////
////        hashMap1.putAll(hashMap2); // map1 = {1=400, 2=200}
////
////        // {2=200, 1=400}
////        System.out.println(hashMap1);
//
//        HashMap<String, Integer> integerHashMap = new HashMap<>();
//        integerHashMap.put("Michael", 25);
//        integerHashMap.put("Alex",35);
//        integerHashMap.replace("Alex",50);
//        System.out.println(integerHashMap);
//

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a","candy");
        map1.put("b","carrot");
        map1.put("c","meh");
        // {a=candy, b=dirt}
        if(map1.containsKey("a")){
            map1.put("b", map1.get("a"));
            map1.replace("a","");
        }
        System.out.println(map1);

    }
}
