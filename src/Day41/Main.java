package Day41;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {



    }

    public static HashMap<Character, Integer> distinctLetters(String word){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : word.toCharArray()){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.replace(i, map.get(i) + 1);
            }
        }
        return map;
    }
}
