package Day29;

import java.util.ArrayList;

public class PracticeArrayListHW2 {
    public static void main(String[] args) {
        //Create PracticeArrayListHW2 java class and do the following tasks:
        //1. Create ArrayList<String> cars and add 5 elements.
        //2. Remove elements at indexes #0 and #2.
        //3. Add 3 more elements.
        //4. Print the size of arraylist, like => "The number of cars is: 6.
        //5. Print all elements using while loop
        //6. Remove all elements with a length less than 7
        //7. Again print the size of cars.
        //8. Print again all elements using for loop
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Car1");
        cars.add("Car2");
        cars.add("Car3");
        cars.add("Car4");
        cars.add("Car5");
        // remove 2 element
        cars.remove(0);
        cars.remove(2);
        // adding 3 elements
        cars.add("car6");
        cars.add("car7");
        cars.add("Mercedes");
        // print the size
        System.out.println(cars.size());
        int i = 0;
        // printing all cars
        while(i < cars.size()){
            System.out.println(cars.get(i));
            i++;
        }
        // [car2, car3, car5, car6, car7, Mercedes]
        for (int j = cars.size()-1; j >= 0; j--) {
            if(cars.get(j).length() < 7){
                cars.remove(j);
            }
        }
        System.out.println("Size after removing is = " + cars.size());
    }
}
