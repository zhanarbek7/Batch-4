package Day31;

import java.util.ArrayList;

public class Factory {
    ArrayList<Bottle> bottles = new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<Employee>();


    public void addBottle(Bottle bottle){
        bottles.add(bottle);
        System.out.println("We added a bottle");
    }

    public void factoryDetails(){
        for (Bottle i: bottles) {
            i.bottleDetails();
        }
    }
}
