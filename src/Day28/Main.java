package Day28;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. array of ints
        int[] array = {1,2,3,4,5};

        // 2. Array List of Integers
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 1. add element to array list
        arrayList.add(1); // arrayList.get(0)
        arrayList.add(2); // arrayList.get(1)
        arrayList.add(599); // arrayList.get(2)
        arrayList.add(300);
        arrayList.add(500);

        System.out.println(arrayList);
        // 2. add element to the specified index
        arrayList.add(3, 123);
        System.out.println(arrayList);

        // 3. returns element at the specified index
        System.out.println(arrayList.get(4));

        // 4. returns the size of arrayList
        System.out.println("Size : "+arrayList.size());

        System.out.println("Last element: " + arrayList.get(arrayList.size()-1));
        // 5. updates a value of element at the specified index
        arrayList.set(arrayList.size()-1, 1000);
        System.out.println("Updated arrayList " + arrayList);

        // 6. removes element at the given index
        arrayList.remove(3);
        System.out.println("Remove from arraylist "+ arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(1);

        arrayList2.remove(1);
        System.out.println(arrayList2);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("One");
        strList.add("Two");
        strList.add("One");
        strList.remove("One");
        System.out.println(strList);

        ArrayList<String> strList2 = new ArrayList<>();
        strList2.add("Mike");
        strList2.add("Lisa");
        strList2.add("John");
        System.out.println(strList2.contains("Mike"));

        ArrayList<String> strList3 = new ArrayList<>(List.of("Laptop","Computer","Smartphone", "Smartphone", "Smartphone","Camera"));
        System.out.println("Index of smartphone " + strList3.indexOf("Smartphone"));
        System.out.println("Last index of smartphone "+ strList3.lastIndexOf("Smartphone"));

        // remove all elements from strList3
        strList3.clear();
        System.out.println("Size of strList3: "+ strList3.size());
        strList3.add("Smartphone");
        System.out.println("Is empty: "+strList3.isEmpty());

        ArrayList<String> students = new ArrayList<>(List.of("student1","student2","student3"));

        String[] studentsArray = new String[students.size()]; // [null, null, null]
        studentsArray = students.toArray(studentsArray);


        ArrayList<Integer> integers = new ArrayList<>(List.of(1,53,55,99,-5,2,333));
        integers.sort(Comparator.naturalOrder()); // sorts from low to high
        integers.sort(Comparator.reverseOrder()); // sorts from high to low


        System.out.println(integers); // [333,99,55,53,2,1,-5]
        // print elements of arrayList in separate lines:
        for(int i = 0; i < integers.size(); i++){
            System.out.println(integers.get(i));
        }
        // 333
        // 99
        // 55
        // 53
        // 2
        // 1
        // -5


    }
}
