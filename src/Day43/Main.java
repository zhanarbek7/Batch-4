package Day43;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(2, 2, 1));
        int target = 9;
        System.out.println(twoSumHashMap(nums, target));
    }

    public static ArrayList<Integer> twoSumNested(ArrayList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                System.out.println(i + " " + j);
            }
        }
        return null;
    }
    public static ArrayList<Integer> twoSumHashMap(ArrayList<Integer> nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            int c = target - nums.get(i);
            if(hashMap.containsKey(c)){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(hashMap.get(c));
                result.add(i);
                return result;
            }
            else{
                hashMap.put(nums.get(i), i);
            }
        }
        return null;
    }
}
